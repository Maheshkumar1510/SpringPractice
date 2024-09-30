package SpringPractice1.controller;

import SpringPractice1.dto.StudentDto;
import SpringPractice1.service.StudentService;
import ch.qos.logback.core.model.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class StudentController {
    @Autowired
    StudentService studentService;

@PostMapping
    public ResponseEntity<String> addStudent(@RequestBody StudentDto studentDto) {
        studentService.addStudent(studentDto);
        return ResponseEntity.status(HttpStatus.CREATED).body("Created");
    }
}



