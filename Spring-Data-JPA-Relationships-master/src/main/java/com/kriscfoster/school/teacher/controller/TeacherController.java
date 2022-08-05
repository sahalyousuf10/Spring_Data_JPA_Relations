package com.kriscfoster.school.teacher.controller;

import com.kriscfoster.school.teacher.repository.TeacherRepository;
import com.kriscfoster.school.teacher.model.Teacher;
import com.kriscfoster.school.teacher.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teachers")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @GetMapping
    public List<Teacher> getTeachers() {
        List<Teacher> teacherList = teacherService.getAllTeachers();
        return teacherList;
    }

    @PostMapping
    Teacher createTeacher(@RequestBody Teacher teacher) {
        Teacher savedTeacher = teacherService.createTeacher(teacher);
        return savedTeacher;
    }
}
