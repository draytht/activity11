package edu.metro.activity11.activity11.soap;

import edu.metro.activity11.activity11.db.CourseEntity;
import edu.metro.activity11.activity11.service.CourseService;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class CourseEndpoint {

    private static final String NS = "http://metro.edu/ics625/courses";

    private final CourseService service;

    public CourseEndpoint(CourseService service) {
        this.service = service;
    }

    @PayloadRoot(namespace = NS, localPart = "addCourseRequest")
    @ResponsePayload
    public AddCourseResponse addCourse(@RequestPayload AddCourseRequest request) {
        CourseType c = request.getCourse();

        CourseEntity e = new CourseEntity();
        e.setNumber(c.getNumber());
        e.setTitle(c.getTitle());
        e.setOffered(c.isOffered());
        e = service.add(e);

        AddCourseResponse resp = new AddCourseResponse();
        resp.setSaved(toCourseType(e));
        return resp;
    }

    @PayloadRoot(namespace = NS, localPart = "getAllCoursesRequest")
    @ResponsePayload
    public GetAllCoursesResponse getAll(@RequestPayload GetAllCoursesRequest request) {
        GetAllCoursesResponse resp = new GetAllCoursesResponse();
        service.all().forEach(e -> resp.getCourses().add(toCourseType(e)));
        return resp;
    }

    private CourseType toCourseType(CourseEntity e) {
        CourseType t = new CourseType();
        t.setId(e.getId() == null ? 0 : e.getId());
        t.setNumber(e.getNumber());
        t.setTitle(e.getTitle());
        t.setOffered(e.isOffered());
        return t;
    }
}