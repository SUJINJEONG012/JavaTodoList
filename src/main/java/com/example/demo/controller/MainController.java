package com.example.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.ToDoEntity;
import com.example.demo.service.ToDoService;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@Controller
public class MainController {
	
	private final ToDoService todoService;
	
	@GetMapping("/")
	public String main(Model model) {
		log.info("히햏 !@@@ :: 제대로 찍히는지 ");
		List<ToDoEntity> todoEntityList = this.todoService.getList();
		model.addAttribute("todoEntityList",todoEntityList);
		return "todolist";
	} 
	
	//할일목록
	@PostMapping("/create")
	public String create(@RequestParam String content) {
		this.todoService.create(content);
		return "redirect:/";
	}
	
	//할일삭제
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> delete(@PathVariable Integer id) {
		this.todoService.delete(id);
		return new ResponseEntity(HttpStatus.OK);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<?> todoUpdate(@PathVariable Integer id, @RequestBody String content) {
		this.todoService.update(id, content);
		return new ResponseEntity(HttpStatus.OK);
	}
	

}

