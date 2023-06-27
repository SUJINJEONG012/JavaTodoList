package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.ToDoEntity;

public interface ToDoRepository extends JpaRepository<ToDoEntity, Integer>{

}
