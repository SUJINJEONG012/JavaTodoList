package com.example.demo;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.example.demo.repository.ToDoRepository;

@SpringBootTest
class JavaTodolistApplicationTests {

	@Autowired
	private ToDoRepository todoRepository;
	
	@Autowired
	private ApplicationContext context;
	@Autowired
	private SqlSessionFactory sessionFactory;
	
	@Test
	void contextLoads() {
		//투두리스트 테스트 데이터 넣기
//		ToDoEntity todo1 = new ToDoEntity();
//		todo1.setContent("공부하기 ");
//		todo1.setCompleted(Boolean.TRUE);
//		this.todoRepository.save(todo1);
//		
//		ToDoEntity todo2 = new ToDoEntity();
//		todo2.setContent("운동하기 ");
//		todo2.setCompleted(Boolean.FALSE);
//		this.todoRepository.save(todo2);
	}
	
	@Test
	void testByApplicationContext() {
		try {
			System.out.println("===========================");
			System.out.println(context.getBean("sqlSessionFactory"));
			System.out.println("===========================");
		}catch(Exception e) {
			e.printStackTrace(); 
		}
	}
	
	@Test
	void testBySqlSessionFactory() {
		try {
			System.out.println("=========================");
			System.out.println(sessionFactory.toString());
			System.out.println("=========================");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
