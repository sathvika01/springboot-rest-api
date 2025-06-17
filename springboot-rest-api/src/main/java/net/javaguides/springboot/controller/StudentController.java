package net.javaguides.springboot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
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

    //Creating Spring Boot REST API that returns List (JSON)
    @GetMapping("students") //http://localhost:8080/students
    public List<Student> getStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student("Allam","Rohith",1));
        students.add(new Student("Nalla","Meghana",2));
        students.add(new Student("Babu","Mahesh",3));
        students.add(new Student("Amala","chintu",4));
        return students;
    }

    /*SpringBoot  REST API with Path Variable(@PathVariable)
     {id} - URI template variable
     whenever client sends request with url http://localhost:8080/students/1 then this 1 value is stored in URI 
     template variable
     @PathVariable annotation used on a method argument to bind it to the value of a URI template variable
     if variables are different then pass the URI template variable @PathVariable("id") int studentId
     So here the id value is dynamically passed by the client
     */  
    @GetMapping("students/{first-name}/{last-name}/{id}")
    public Student studentPathVariable(@PathVariable int id,
                                        @PathVariable("first-name") String firstName,
                                        @PathVariable("last-name") String lastName){
        return new Student(firstName,lastName,id);
    }

    /*RequestParameter
    lets say we got a request from client with a query parameter (which has ?) 
    http://localhost:8080/Students/query?firstName=Sathvika&lastName=Billa&id=1
     * 
     */
    @GetMapping("Students/query")
    public Student studentRequestVariable(@RequestParam int id,
                                            @RequestParam String firstName,
                                            @RequestParam String lastName){
        return new Student(firstName,lastName,id);
    }



    

}
