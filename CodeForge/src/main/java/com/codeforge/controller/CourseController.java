package com.codeforge.controller;

import com.codeforge.models.Course;
import com.codeforge.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
@RequiredArgsConstructor
public class CourseController {

    private final CourseService courseService;


    @PostMapping("/create")
    public Course createCourse(@RequestBody Course course) {
        return courseService.createCourse(course);
    }


    @GetMapping
    public List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }
}
