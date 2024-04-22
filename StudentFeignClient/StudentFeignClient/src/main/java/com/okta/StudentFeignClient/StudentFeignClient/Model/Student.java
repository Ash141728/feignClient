package com.okta.StudentFeignClient.StudentFeignClient.Model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Getter
@Setter
public class Student {
    private int id;
    private String name;

}

