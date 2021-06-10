package com.er5bus.ws.soap.consume.WhiteTestsClasses;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "studentId",
    "examCode"
})
@XmlRootElement(name = "StudentRequest")
public class StudentRequest {

    protected int studentId;
    @XmlElement(required = true)
    protected String examCode;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int value) {
        this.studentId = value;
    }

    public String getExamCode() {
        return examCode;
    }

    public void setExamCode(String value) {
        this.examCode = value;
    }
}
