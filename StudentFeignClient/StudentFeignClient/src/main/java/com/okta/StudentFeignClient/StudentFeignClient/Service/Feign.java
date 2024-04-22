package com.okta.StudentFeignClient.StudentFeignClient.Service;

import com.okta.StudentFeignClient.StudentFeignClient.Model.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "remote-service-name", url = "http://localhost:8081") // Replace with actual URL and path
public interface Feign {



        @PostMapping("/user")
        Student getUserById(Student student);

}
