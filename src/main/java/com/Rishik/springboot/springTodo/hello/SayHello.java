package com.Rishik.springboot.springTodo.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHello {
    @RequestMapping("/say-hello")
    @ResponseBody
    public  String sayHello()
    {
       return "Hello, How are you doing?";
    }
}
