package edu.metro.activity11.activity11.soap;

import jakarta.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "title" })
@XmlRootElement(name = "getCourseByTitleRequest")
public class GetCourseByTitleRequest {

    @XmlElement(required = true)
    protected String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
