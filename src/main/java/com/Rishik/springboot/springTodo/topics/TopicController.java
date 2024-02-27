package com.Rishik.springboot.springTodo.topics;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

    @RequestMapping("/topics")
    public String topics()
    {
        return "ALl topics";
    }
}
