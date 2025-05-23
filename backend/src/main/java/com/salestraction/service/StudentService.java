package com.salestraction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import com.salestraction.model.Student;
import com.salestraction.repository.StudentRepository;

import java.util.List;


@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public List<Student> getStudentsByAdminValidation(Integer adminValidation) {
        return studentRepository.findByAdminValidation(adminValidation);
    }

    public Student getStudentById(Integer id) {
        return studentRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Student not found"));
    }

    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    public void deleteStudent(Integer id) {
        studentRepository.deleteById(id);
    }
    public Student findByEmail(String email) {
        return studentRepository.findByEmail(email);
    }
    public Student updateStudentWithPasswordCheck(Integer id, Student updatedStudent) {
        Student existingStudent = getStudentById(id);
        if (updatedStudent.getPassword() == null || updatedStudent.getPassword().isEmpty()) {
            updatedStudent.setPassword(existingStudent.getPassword());
        }
        updatedStudent.setId_student(id);
        return saveStudent(updatedStudent);
    }
}

