package edu.metro.activity11.activity11.soap;

import jakarta.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "addCourseRequest", namespace = "http://metro.edu/ics625/courses")
public class AddCourseRequest {

    @XmlElement(name = "course", namespace = "http://metro.edu/ics625/courses", required = true)
    private CourseType course;

    public CourseType getCourse() { return course; }
    public void setCourse(CourseType course) { this.course = course; }
}