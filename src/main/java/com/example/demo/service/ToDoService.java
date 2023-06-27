package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.ToDoEntity;
import com.example.demo.repository.ToDoRepository;

import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@Service
public class ToDoService {
	
	private final ToDoRepository todoRepository;
	
	public List<ToDoEntity> getList(){
		return this.todoRepository.findAll();
	}
}
