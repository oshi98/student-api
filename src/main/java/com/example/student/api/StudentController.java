package com.example.student.api;

import org.springframework.web.bind.annotation.*;

@RestController

public class StudentController {

    StudentRepository repository = new InMemoryStudentRepository();

    //REST ENDPOINTS
    //create a student
    @PostMapping("/student")
    public void createStudent(@RequestBody Student student){

        //todo: logic to save the student in the database

        repository.save(student);

//        System.out.println("name: "+student.name);
//        System.out.println("age: "+student.age);
//        System.out.println("tp: "+student.tp);

    }

    @GetMapping("/student/{id}")
    public Student getStudent(@PathVariable("id") String id){
        return repository.get(id);
    }

    //delete
    @DeleteMapping("/student{id}")
    public Student deleteStudent(@PathVariable("id") String id){
        return repository.delete(id);
    }


    //update
    @PutMapping("/student")
    public Student updateStudent(@PathVariable Student student){
        return repository.update(student);
    }

}
