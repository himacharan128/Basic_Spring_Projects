package com.techmojo.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techmojo.app.pojo.Student;
import com.techmojo.app.service.StudentsService;

@RestController(value = "/students")
public class StudentsController {

	@Autowired
	private StudentsService studentsService;

	@PostMapping()
	void create(Student student) {
		studentsService.create(student);

	}
}
