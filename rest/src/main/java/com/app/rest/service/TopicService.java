package com.app.rest.service;

import com.app.rest.models.Topic;
import com.app.rest.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

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
//        return topics;
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }

    public Topic getTopic(String id)  {
//        System.out.println(topics.stream().filter(topic-> topic.getId().equals(id)).findFirst());
//        return topics.stream().filter(topic-> topic.getId().equals(id)).findFirst().get();
        Topic topic =  topicRepository.findById(id).get();

        return topic;
    }

    public void addTopic(Topic topic){
//        topics.add(topic);
        topicRepository.save(topic);
    }

    public void updateTopic(Topic topic, String id){

        topicRepository.save(topic);
//        for (int i = 0; i < topics.size();  i++){
//            Topic t = topics.get(i);
//            if (t.getId().equals(id)){
//                topics.set(i, topic);
//                break;
//            }
//        }

    }

    public void deleteTopic(String id){
//        topics.removeIf(t -> t.getId().equals(id));

        topicRepository.deleteById(id);
    }

}