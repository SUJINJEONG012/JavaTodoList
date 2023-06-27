package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.ToDoEntity;
import com.example.demo.repository.ToDoRepository;

@SpringBootTest
class JavaTodolistApplicationTests {

	@Autowired
	private ToDoRepository todoRepository;
	
	@Test
	void contextLoads() {
		
		ToDoEntity todo1 = new ToDoEntity();
		todo1.setContent("공부하기 ");
		todo1.setCompleted(Boolean.TRUE);
		this.todoRepository.save(todo1);
		
		ToDoEntity todo2 = new ToDoEntity();
		todo2.setContent("운동하기 ");
		todo2.setCompleted(Boolean.FALSE);
		this.todoRepository.save(todo2);
		
		
	}

}
