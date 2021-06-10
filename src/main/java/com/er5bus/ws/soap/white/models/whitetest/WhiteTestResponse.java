package com.er5bus.ws.soap.consume.WhiteTestsClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "student",
    "exam",
    "date",
    "badRequests"
})
@XmlRootElement(name = "WhiteTestResponse")
public class WhiteTestResponse {

    @XmlElement(required = true)
    protected Student student;
    @XmlElement(required = true)
    protected Exam exam;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;
    @XmlElement(required = true)
    protected List<String> badRequests;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student value) {
        this.student = value;
    }

    public Exam getExam() {
        return exam;
    }

    public void setExam(Exam value) {
        this.exam = value;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date value) {
        this.date = value;
    }

    public List<String> getBadRequests() {
        if (badRequests == null) {
            badRequests = new ArrayList<String>();
        }
        return this.badRequests;
    }
}
