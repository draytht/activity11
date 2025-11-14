package edu.metro.activity11.activity11.soap;

import jakarta.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "id", "title", "description" })
@XmlRootElement(name = "updateCourseRequest")
public class UpdateCourseRequest {

    @XmlElement(required = true)
    protected long id;

    @XmlElement(required = true)
    protected String title;

    @XmlElement(required = true)
    protected String description;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
