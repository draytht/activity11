package edu.metro.activity11.activity11.soap;

import jakarta.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "number" })
@XmlRootElement(name = "getCourseByNumberRequest")
public class GetCourseByNumberRequest {

    @XmlElement(required = true)
    protected String number;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
