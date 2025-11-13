package edu.metro.activity11.activity11.soap;

import jakarta.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "getAllCoursesResponse", namespace = "http://metro.edu/ics625/courses")
public class GetAllCoursesResponse {

    @XmlElement(name = "courses", namespace = "http://metro.edu/ics625/courses")
    private List<CourseType> courses = new ArrayList<>();

    public List<CourseType> getCourses() {
        return courses;
    }
}