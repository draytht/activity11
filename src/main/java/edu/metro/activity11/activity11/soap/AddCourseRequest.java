package edu.metro.activity11.activity11.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "course" })
@XmlRootElement(name = "addCourseRequest")
public class AddCourseRequest {

    @XmlElement(required = true)
    protected CourseType course;

    public CourseType getCourse() {
        return course;
    }

    public void setCourse(CourseType value) {
        this.course = value;
    }
}
