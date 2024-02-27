package com.Rishik.springboot.springTodo.topics;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    private List<Topic> topics = Arrays.asList(
            new Topic("1","Java"),
            new Topic("2","SpringBoot"),
            new Topic("3","REST"));

    public List<Topic> getAllTopics()
    {
        return topics;
    }

    public Topic getTopic(String id)
    {
        return topics.stream()
                .filter(topic->topic.getId().equals(id))
                .findFirst().orElse(null);
    }


}
