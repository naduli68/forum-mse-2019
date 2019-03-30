package com.mse.forum.controllers;


import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.mse.forum.dto.TopicDTO;
import com.mse.forum.services.TopicService;

import lombok.AllArgsConstructor;


@AllArgsConstructor
@RestController
@RequestMapping(path="/topics")
@CrossOrigin(origins = "*")
public class TopicsControler {

	private TopicService service;
	
	@RequestMapping(method=RequestMethod.GET)
	public List<TopicDTO> getAll(){
		
		return service.getAll();
			}
	
	@RequestMapping(path = "/title/{title}/", method=RequestMethod.GET)
	public TopicDTO getTopicByTitle(@PathVariable (value="title") String title){
		
		return service.findByTitle(title);
			}
	@RequestMapping(path = "/id/{id}", method =RequestMethod.GET)
	public TopicDTO getRepliesById(@PathVariable Long id) {
		 return service.findById(id);
		 
	}
	@RequestMapping(method = RequestMethod.POST,consumes= "application/json")
	public void createTopic(@RequestBody TopicDTO topic){
		service.saveTopic(topic);
		
	
	}
}
