package com.er5bus.ws.soap.white.services;


import java.time.LocalDateTime;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.springframework.stereotype.Service;

import com.er5bus.ws.soap.white.models.whitetest.Exam;
import com.er5bus.ws.soap.white.models.whitetest.Student;
import com.er5bus.ws.soap.white.models.whitetest.StudentRequest;
import com.er5bus.ws.soap.white.models.whitetest.WhiteTestResponse;

@Service
public class WhiteService {
	
	public WhiteTestResponse register(StudentRequest request) {
		
		WhiteTestResponse response = new WhiteTestResponse();
		
		if(request.getStudentId() <= 0)
			response.getBadRequests().add("Student ID not found or not Valid");
		
		try {
			Integer.parseInt(request.getExamCode());
		} catch (NumberFormatException e) {
			response.getBadRequests().add("Exam Code not found or not valid");
		}
		
		if(response.getBadRequests().isEmpty()) {
			Student student = new Student();
			student.setId(request.getStudentId());
			student.setName("student1");
      
      Address address = new Address();
      address.setStreet("street name");
      address.setCity("city name");
      address.setPosteCode(5190);

			student.setAddress(address);
			
			Exam exam = new Exam();
			exam.setCode(request.getExamCode());
			exam.setName("TestExam");
			
			response.setExam(exam);
			response.setStudent(student);
      response.setDate(new Date(21, 10, 5));			
		}
		System.out.println(response.getBadRequests());
		return response;
	}

}
