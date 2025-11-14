package edu.metro.activity11.activity11.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import edu.metro.activity11.activity11.db.CourseEntity;
import edu.metro.activity11.activity11.db.CourseRepository;

@Service
public class CourseService {

    private final CourseRepository repo;

    public CourseService(CourseRepository repo) {
        this.repo = repo;
    }

    public CourseEntity save(CourseEntity entity) {
        return repo.save(entity);
    }

    public List<CourseEntity> getAllCourses() {
        return (List<CourseEntity>) repo.findAll();
    }

    public List<CourseEntity> getAllOfferedCourses() {
        return repo.findByOfferedTrue();
    }

    public CourseEntity getCourseById(long id) {
        return repo.findById(id).orElse(null);
    }

    public List<CourseEntity> getCourseByNumber(String number) {
        return repo.findByNumber(number);
    }

    public List<CourseEntity> getCourseByTitle(String title) {
        return repo.findByTitle(title);
    }

    public boolean deleteCourseById(long id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
            return true;
        }
        return false;
    }

    public CourseEntity updateCourse(long id, String title, String description) {
        Optional<CourseEntity> opt = repo.findById(id);
        if (opt.isEmpty()) {
            return null;
        }
        CourseEntity entity = opt.get();
        entity.setTitle(title);
        entity.setDescription(description);
        return repo.save(entity);
    }
}
