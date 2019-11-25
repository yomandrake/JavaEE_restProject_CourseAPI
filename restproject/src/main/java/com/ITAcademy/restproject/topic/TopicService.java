package com.ITAcademy.restproject.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("spring","SpringFrameworks","SpringFrameworks Description"),
			new Topic("java","CoreJava","Core Java Description"),
			new Topic("javascript","Javascript","Javascript Description")));
	
	public  List<Topic> getAllTopics() {
		return topics;
	}
	
	
	public Topic getTopic(String id) {
		return topics.stream().filter(t-> t.getId().equals(id)).findFirst().get();
	}
	
	public void addTopic(Topic topic) {
		topics.add(topic);
	}
	
	
}