package com.example.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.entity.ToDoEntity;
import com.example.demo.service.ToDoService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class MainController {
	
	private final ToDoService todoService;
	
	@GetMapping("/")
	public String main(Model model) {
		List<ToDoEntity> todoEntityList = this.todoService.getList();
		model.addAttribute("todoEntityList",todoEntityList);
		return "todolist";
	} 
}

