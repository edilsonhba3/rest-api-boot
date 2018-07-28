package com.crud.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.model.dto.Message;
import com.crud.service.MessageService;

@CrossOrigin(origins="*", allowedHeaders="*")
@RestController
@RequestMapping("/api/message")
public class MessageController 
{
	@Autowired
	MessageService messageService;
	
	@GetMapping("/getAll")
	public List<Message> getAll()
	{
		return messageService.getAll();
	}
	
	@GetMapping("/find/{id}")
	public Message find(@PathVariable Long id)
	{
		return messageService.find(id);
	}
	
	@PostMapping("/add")
	public Message add(@RequestBody Message message)
	{
		return messageService.add(message);
	}
		
	@PutMapping("/add")
	public Message update(@RequestBody Message message)
	{
		return messageService.add(message);
	}
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable Long id)
	{
		messageService.delete(id);
		return "{\"val\":\"echo\"}";
	}
}
