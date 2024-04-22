package com.okta.NotificationFeignClient.NotificationFeignClient.Controller;

import com.okta.NotificationFeignClient.NotificationFeignClient.Model.Student;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotiController {

    @PostMapping("/user")
    public Student save(@RequestBody Student student){
        System.out.print(student.toString());
        return student;
    }
}
