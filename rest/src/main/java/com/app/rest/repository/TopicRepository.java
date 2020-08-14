package com.app.rest.repository;

import com.app.rest.models.Topic;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.Id;

public interface TopicRepository extends CrudRepository<Topic, String> {



}
