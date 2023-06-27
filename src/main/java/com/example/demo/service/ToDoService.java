package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.demo.entity.ToDoEntity;
import com.example.demo.repository.ToDoRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class ToDoService {

	private final ToDoRepository todoRepository;

	public List<ToDoEntity> getList() {
		return this.todoRepository.findAll();
	}

	public void create(String content) {
		ToDoEntity todoEntity = new ToDoEntity();
		todoEntity.setContent(content);
		todoEntity.setCompleted(false);
		this.todoRepository.save(todoEntity);
	}
	
	@Transactional
	public void delete(Integer id) {
		ToDoEntity todoEntity = todoRepository.findById(id)
				.orElseThrow(()-> new IllegalArgumentException("해당 아이디가 없습니다.id= " + id));
		
		this.todoRepository.delete(todoEntity);
	}

}
