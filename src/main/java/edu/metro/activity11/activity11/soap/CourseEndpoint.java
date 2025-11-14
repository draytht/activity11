package edu.metro.activity11.activity11.soap;

import java.util.List;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import edu.metro.activity11.activity11.db.CourseEntity;
import edu.metro.activity11.activity11.service.CourseService;

@Endpoint
public class CourseEndpoint {

    private static final String NAMESPACE_URI = "http://metro.edu/ics625/courses";

    private final CourseService service;

    public CourseEndpoint(CourseService service) {
        this.service = service;
    }

    private CourseType toCourseType(CourseEntity entity) {
        if (entity == null) return null;

        CourseType type = new CourseType();
        type.setId(entity.getId());
        type.setNumber(entity.getNumber());
        type.setTitle(entity.getTitle());
        type.setDescription(entity.getDescription());
        type.setOffered(entity.isOffered());
        return type;
    }

    private CourseEntity fromCourseType(CourseType type) {
        CourseEntity entity = new CourseEntity();
        entity.setId(type.getId());
        entity.setNumber(type.getNumber());
        entity.setTitle(type.getTitle());
        entity.setDescription(type.getDescription());
        entity.setOffered(type.isOffered());
        return entity;
    }

    // add new course
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "addCourseRequest")
    @ResponsePayload
    public AddCourseResponse addCourse(@RequestPayload AddCourseRequest request) {
        CourseEntity saved = service.save(fromCourseType(request.getCourse()));
        AddCourseResponse response = new AddCourseResponse();
        response.setSaved(toCourseType(saved));
        return response;
    }

    // get all courses
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getAllCoursesRequest")
    @ResponsePayload
    public GetAllCoursesResponse getAllCourses(@RequestPayload GetAllCoursesRequest request) {
        GetAllCoursesResponse response = new GetAllCoursesResponse();
        List<CourseEntity> all = service.getAllCourses();
        for (CourseEntity e : all) {
            response.getCourses().add(toCourseType(e));
        }
        return response;
    }

    // get all offered courses
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getAllOfferedCoursesRequest")
    @ResponsePayload
    public GetAllOfferedCoursesResponse getAllOfferedCourses(@RequestPayload GetAllOfferedCoursesRequest request) {
        GetAllOfferedCoursesResponse response = new GetAllOfferedCoursesResponse();
        List<CourseEntity> all = service.getAllOfferedCourses();
        for (CourseEntity e : all) {
            response.getCourses().add(toCourseType(e));
        }
        return response;
    }

    // get by ID
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCourseByIdRequest")
    @ResponsePayload
    public GetCourseByIdResponse getCourseById(@RequestPayload GetCourseByIdRequest request) {
        CourseEntity entity = service.getCourseById(request.getId());
        GetCourseByIdResponse response = new GetCourseByIdResponse();
        response.setCourse(toCourseType(entity));
        return response;
    }

    // get by number
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCourseByNumberRequest")
    @ResponsePayload
    public GetCourseByNumberResponse getCourseByNumber(@RequestPayload GetCourseByNumberRequest request) {
        List<CourseEntity> list = service.getCourseByNumber(request.getNumber());
        GetCourseByNumberResponse response = new GetCourseByNumberResponse();
        for (CourseEntity e : list) {
            response.getCourses().add(toCourseType(e));
        }
        return response;
    }

    // get by title
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCourseByTitleRequest")
    @ResponsePayload
    public GetCourseByTitleResponse getCourseByTitle(@RequestPayload GetCourseByTitleRequest request) {
        List<CourseEntity> list = service.getCourseByTitle(request.getTitle());
        GetCourseByTitleResponse response = new GetCourseByTitleResponse();
        for (CourseEntity e : list) {
            response.getCourses().add(toCourseType(e));
        }
        return response;
    }

    // delete by ID
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "deleteCourseByIdRequest")
    @ResponsePayload
    public DeleteCourseByIdResponse deleteCourseById(@RequestPayload DeleteCourseByIdRequest request) {
        boolean deleted = service.deleteCourseById(request.getId());
        DeleteCourseByIdResponse response = new DeleteCourseByIdResponse();
        response.setDeleted(deleted);
        return response;
    }

    // update course (only title + description)
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "updateCourseRequest")
    @ResponsePayload
    public UpdateCourseResponse updateCourse(@RequestPayload UpdateCourseRequest request) {
        CourseEntity updated = service.updateCourse(
                request.getId(),
                request.getTitle(),
                request.getDescription());

        UpdateCourseResponse response = new UpdateCourseResponse();
        response.setUpdated(toCourseType(updated));
        return response;
    }
}
