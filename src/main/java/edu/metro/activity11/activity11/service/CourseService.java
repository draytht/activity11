package edu.metro.activity11.activity11.service;

import edu.metro.activity11.activity11.db.CourseEntity;
import edu.metro.activity11.activity11.db.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    private final CourseRepository repo;

    public CourseService(CourseRepository repo) {
        this.repo = repo;
    }

    public CourseEntity add(CourseEntity c) {
        return repo.save(c);
    }

    public List<CourseEntity> all() {
        return repo.findAll();
    }
}