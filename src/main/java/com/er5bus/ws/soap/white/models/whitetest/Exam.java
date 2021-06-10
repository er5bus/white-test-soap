package com.er5bus.ws.soap.consume.WhiteTestsClasses;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Exam", propOrder = {
    "code",
    "name"
})
public class Exam {

    @XmlElement(required = true)
    private String code;
    @XmlElement(required = true)
    private String name;

    public String getCode() {
        return code;
    }

    public void setCode(String value) {
        this.code = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }
}
