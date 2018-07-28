package com.crud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.model.dto.Message;
import com.crud.model.repo.MessageRepo;
import com.crud.service.MessageService;

@Service
public class MessageServiceImpl implements MessageService
{
	
	@Autowired
	MessageRepo messageRepo;

	@Override
	public List<Message> getAll()
	{
		return messageRepo.findAll();
	}

	@Override
	public Message add(Message message) 
	{
		return messageRepo.save(message);
	}

	@Override
	public void delete(Long id) 
	{
		messageRepo.deleteById(id);
	}

	@Override
	public Message find(Long id) 
	{
		return messageRepo.findById(id).get();
	}

}
