package com.example.demo.service;

import com.example.demo.response.Topic;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;

@Service
public class TopicService {

    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic(1, "bnana", "lablel1"),
            new Topic(2, "xxx", "lablel4"),
            new Topic(3, "dani", "lablel44")));

    public List<Topic> listAll(){
        return this.topics;
    }

    public Topic getTopic(Integer Id){
        return this.topics.stream()
                .filter(topic -> topic.getId().equals(Id))
                .findFirst()
                .orElse(null);
    }

    public void postTopic(Topic topic){
        this.topics.add(topic);
    }
}
