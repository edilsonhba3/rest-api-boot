package com.crud.model.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.model.dto.Message;


public interface MessageRepo extends JpaRepository<Message, Long>
{
}
