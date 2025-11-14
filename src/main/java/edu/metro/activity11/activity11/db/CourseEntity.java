package edu.metro.activity11.activity11.db;

import jakarta.persistence.*;

@Entity
@Table(name = "courses")
public class CourseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String number;
    private String title;
    private boolean offered;
    @Column(length = 2000)
    private String description;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNumber() { return number; }
    public void setNumber(String number) { this.number = number; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getDescription(){ return description;}
    public void setDescription(String description){ this.description = description; }

    public boolean isOffered() { return offered; }
    public void setOffered(boolean offered) { this.offered = offered; }
}