package com.example.demo.controller;

import com.example.demo.response.Topic;
import com.example.demo.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class GreetController {

    @Autowired
    private TopicService topicService;

    @RequestMapping("/hello")
    public String HelloWorld() {
        return "Hello World!";
    }

    @RequestMapping("/topics")
    public List<Topic> getTopics() {
        return topicService.listAll();
    }

    @RequestMapping("/topics/{id}")
    public Topic getTopic(@PathVariable Integer id) {
        return topicService.getTopic(id);
    }

    @PostMapping(value = "/topics")
    public void postTopic(@RequestBody @Valid Topic topic) {
        try {
            topicService.postTopic(topic);
        }
        catch (Exception e){
          System.out.println(e);
        }
    }
}
