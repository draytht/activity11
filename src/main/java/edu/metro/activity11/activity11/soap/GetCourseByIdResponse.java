package edu.metro.activity11.activity11.soap;

import jakarta.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "course" })
@XmlRootElement(name = "getCourseByIdResponse")
public class GetCourseByIdResponse {

    @XmlElement(name = "course")
    protected CourseType course;

    public CourseType getCourse() {
        return course;
    }

    public void setCourse(CourseType course) {
        this.course = course;
    }
}
