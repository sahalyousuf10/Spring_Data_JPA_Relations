package com.kriscfoster.school.student.controller;

import com.kriscfoster.school.student.repository.StudentRepository;
import com.kriscfoster.school.student.model.Student;
import com.kriscfoster.school.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Student> getStudents() {
        List<Student> studentList = studentService.getStudents();
        return studentList;
    }

    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        Student savedStudent = studentService.saveStudent(student);
        return savedStudent;
    }
}