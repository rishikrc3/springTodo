package com.Rishik.springboot.springTodo.topics;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @RequestMapping("/topics")
    public List<Topic> topics()
    {
        Topic [] topicsArray = {
                new Topic(1,"Java"),
                new Topic(2,"Spring"),
                new Topic(3,"REST")
        };
        return Arrays.asList(topicsArray);
    }
}
