package com.allinjava.hijenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HiJenkinsApplication {

    public static void main(String[] args) {
        SpringApplication.run(HiJenkinsApplication.class, args);
    }

    @RequestMapping("hi")
    public String hi(){
        return "hi this is jenkins deploy";
    }

}
