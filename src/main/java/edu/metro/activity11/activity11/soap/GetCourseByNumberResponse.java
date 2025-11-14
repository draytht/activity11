package edu.metro.activity11.activity11.soap;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "courses" })
@XmlRootElement(name = "getCourseByNumberResponse")
public class GetCourseByNumberResponse {

    @XmlElement(name = "courses")
    protected List<CourseType> courses;

    public List<CourseType> getCourses() {
        if (courses == null) {
            courses = new ArrayList<>();
        }
        return courses;
    }
}
