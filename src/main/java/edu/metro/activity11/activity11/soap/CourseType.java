package edu.metro.activity11.activity11.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "courseType", propOrder = { "id", "number", "title", "offered" })
public class CourseType {

    @XmlElement(name = "id")
    private Long id;

    @XmlElement(name = "number", required = true)
    private String number;

    @XmlElement(name = "title", required = true)
    private String title;

    @XmlElement(name = "description", required = true)
    private String description;

    @XmlElement(name = "offered")
    private boolean offered;

    public Long getId() {
        return id;
    }

    public void setId(Long value) {
        this.id = value;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String value) {
        this.number = value;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String value) {
        this.title = value;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String value) {
        this.description = value;
    }

    public boolean isOffered() {
        return offered;
    }

    public void setOffered(boolean value) {
        this.offered = value;
    }
}
