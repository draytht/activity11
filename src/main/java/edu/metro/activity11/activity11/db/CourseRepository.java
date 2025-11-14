package edu.metro.activity11.activity11.db;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<CourseEntity, Long> {
    List<CourseEntity> findByOfferedTrue();
    List<CourseEntity> findByNumber(String number);
    List<CourseEntity> findByTitle(String title);
}
