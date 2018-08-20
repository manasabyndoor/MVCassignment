package com.demo.rest.service.topic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	ArrayList<TopicPojo> list = new ArrayList<TopicPojo>();

	public List<TopicPojo> getAll() {
		list.add(new TopicPojo("asa", "dsas", "sdds"));
		list.add(new TopicPojo("dsb", "dsas", "sdds"));
		list.add(new TopicPojo("dsc", "dsas", "sdds"));
		return list;

	}

	public TopicPojo getTopic(String id) {

		return list.stream().filter(t -> t.getId().equals(id)).findFirst().get();

	}

	public void add(TopicPojo topic) {
	list.add(topic);
	}

	public void update(TopicPojo topic,String id) {
		for(int i=0;i<list.size();i++)
		{
			TopicPojo t= list.get(i);
			
			if(t.getId().equals(id))
			list.set(i, topic);
			return;  
			
		}
		
	}

	public void delete(String id) {
		list.removeIf(t-> t.getId().equals(id));
	}

}
