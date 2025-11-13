package edu.metro.activity11.activity11.soap;

import jakarta.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "courseType", propOrder = { "id", "number", "title", "offered" })
public class CourseType {

    @XmlElement(required = true)
    private long id;

    @XmlElement(required = true)
    private String number;

    @XmlElement(required = true)
    private String title;

    @XmlElement(required = true)
    private boolean offered;

    public long getId() { return id; }
    public void setId(long id) { this.id = id; }

    public String getNumber() { return number; }
    public void setNumber(String number) { this.number = number; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public boolean isOffered() { return offered; }
    public void setOffered(boolean offered) { this.offered = offered; }
}