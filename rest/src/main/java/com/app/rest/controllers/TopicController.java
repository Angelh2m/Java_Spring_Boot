package com.app.rest.controllers;


import com.app.rest.models.Topic;
import com.app.rest.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @Autowired
    TopicService topicService;

    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){

        return topicService.getAllTopics();
    }

    @RequestMapping("topics/{id}")
    public Topic getTopic(@PathVariable String id){
        return topicService.getTopic((id));
    }

    @RequestMapping(method = RequestMethod.POST, value="/topics" )
    public Topic addTopics(@RequestBody Topic topic){
        topicService.addTopic(topic);
        return topic;
    }

    @RequestMapping(method = RequestMethod.PUT, value="/topics/{id}" )
    public void updateTopic(@RequestBody Topic topic, @PathVariable  String id){
        topicService.updateTopic(topic, id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value="topics/{id}")
    public void deleteTopic(@PathVariable String id){
         topicService.deleteTopic((id));
    }



}
