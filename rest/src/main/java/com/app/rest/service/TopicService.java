package com.app.rest.service;

import com.app.rest.models.Topic;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    //    asList is immutable
    private List<Topic> topics = new ArrayList<>(
            Arrays.asList(
                    new Topic("Course", "1", "Nice"),
                    new Topic("Macbook", "2", "Nice"),
                    new Topic("Pc", "3", "Nice"),
                    new Topic("Tablets", "4", "Nice.")
            )
    );

    public List<Topic> getAllTopics() {
        return topics;
    }

    public Topic getTopic(String id){
        System.out.println(topics.stream().filter(topic-> topic.getId().equals(id)).findFirst());
        return topics.stream().filter(topic-> topic.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topic topic){

        System.out.println(topic.toString());
        topics.add(topic);
    }

}