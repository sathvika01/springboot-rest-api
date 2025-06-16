package net.javaguides.springboot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.springboot.bean.Student;

@RestController

//Creating Spring Boot REST API that returns Java Bean (JSON)
public class StudentController {

    @GetMapping("student") //http://localhost:8080/student
    public Student getStudent(){
        Student student = new Student("Billa", "Sathvika", 1);
        return student;

    }

    

}
