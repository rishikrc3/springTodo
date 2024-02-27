package com.Rishik.springboot.springTodo.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {

    //Request mapping maps the get request by default for other methods, we need other mappings
    @RequestMapping("/hello")
    public String sayHi()
    {
        return "Hi";
    }
}
