package com.kriscfoster.school.student.service;

import com.kriscfoster.school.student.model.Student;
import com.kriscfoster.school.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getStudents() {
        List<Student> studentList = studentRepository.findAll();
        return studentList;
    }

    public Student saveStudent(Student student) {
        Student savedStudent = studentRepository.save(student);
        return savedStudent;
    }
}
