package com.Rishik.springboot.springTodo.topics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    @RequestMapping("/topics")
    public List<Topic> topics()
    {
        return topicService.getAllTopics();
    }
    @RequestMapping("/topics/{id}")
    public Topic getTopic(@PathVariable String id)
    {
        return topicService.getTopic(id);
    }
    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    public String addTopic(@RequestBody Topic topic)
    {
        topicService.addTopic(topic);
        return "New Topic , Added!";
    }
    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
    public String updateTopic(@RequestBody Topic topic, @PathVariable String id)
    {
        topicService.updateTopic(id, topic);

        return "Topic Updated";
    }
}
