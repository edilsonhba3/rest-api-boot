package com.crud.service;

import java.util.List;

import com.crud.model.dto.Message;

public interface MessageService
{
	public List<Message> getAll();
	public Message add(Message message);
	public void delete(Long id);
	public Message find(Long id);
}
