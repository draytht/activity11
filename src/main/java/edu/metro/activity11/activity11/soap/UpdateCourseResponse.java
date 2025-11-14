package edu.metro.activity11.activity11.soap;

import jakarta.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "updated" })
@XmlRootElement(name = "updateCourseResponse")
public class UpdateCourseResponse {

    @XmlElement(name = "updated")
    protected CourseType updated;

    public CourseType getUpdated() {
        return updated;
    }

    public void setUpdated(CourseType updated) {
        this.updated = updated;
    }
}
