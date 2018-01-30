package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resources;

/**
 * Created by agpc on 2018/1/30.
 */
@RestController
public class TestController {
    @RequestMapping("/demo")
    public String demo(){
        return "请注意,倒车!";
    }

}
