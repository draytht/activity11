package edu.metro.activity11.activity11.soap;

import java.util.ArrayList;
import java.util.List;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "courses" })
@XmlRootElement(name = "getAllCoursesResponse")
public class GetAllCoursesResponse {

    @XmlElement(name = "courses")
    protected List<CourseType> courses;

    public List<CourseType> getCourses() {
        if (courses == null) {
            courses = new ArrayList<>();
        }
        return this.courses;
    }

    public void setCourses(List<CourseType> courses) {
        this.courses = courses;
    }
}
