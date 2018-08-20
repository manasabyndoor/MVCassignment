package com.demo.rest.service.topic;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Topic {
	@Autowired
	TopicService service =new TopicService();
	@RequestMapping("/topics")
	public List<TopicPojo> getAllTopic() {
		return service.getAll(); 

	}
	@RequestMapping("/topics/{id}")
	public TopicPojo getTopic(@PathVariable String id) {
		return service.getTopic(id); 

	}
	@RequestMapping(method=RequestMethod.POST, value="/topics")
	public void add(@RequestBody TopicPojo topic) {
		service.add(topic);
	}

	@RequestMapping(method=RequestMethod.PUT, value="/topics/{id}")
	public void update(@RequestBody TopicPojo topic,@PathVariable String id) {
		service.update(topic, id);
	}
	@RequestMapping(method=RequestMethod.DELETE, value="/topics/{id}")
	public void update(@PathVariable String id) {
		service.delete(id);
	}
}
