package com.okta.StudentFeignClient.StudentFeignClient.Controller;

import com.okta.StudentFeignClient.StudentFeignClient.Model.Student;
import com.okta.StudentFeignClient.StudentFeignClient.Service.Feign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    Feign feign;

    @PostMapping("/save")
    public ResponseEntity<Student> save(@RequestBody Student student){

        feign.getUserById(student);
        return new ResponseEntity<>(student, HttpStatus.FOUND);
    }

}
