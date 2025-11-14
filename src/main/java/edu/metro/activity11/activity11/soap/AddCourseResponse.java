package edu.metro.activity11.activity11.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "saved" })
@XmlRootElement(name = "addCourseResponse")
public class AddCourseResponse {

    @XmlElement(required = true)
    protected CourseType saved;

    public CourseType getSaved() {
        return saved;
    }

    public void setSaved(CourseType value) {
        this.saved = value;
    }
}
