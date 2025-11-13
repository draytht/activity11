package edu.metro.activity11.activity11.soap;

import jakarta.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "addCourseResponse", namespace = "http://metro.edu/ics625/courses")
public class AddCourseResponse {

    @XmlElement(name = "saved", namespace = "http://metro.edu/ics625/courses", required = true)
    private CourseType saved;

    public CourseType getSaved() { return saved; }
    public void setSaved(CourseType saved) { this.saved = saved; }
}