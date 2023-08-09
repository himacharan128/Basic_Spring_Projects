package com.techmojo.app.service.impl;

import java.util.HashMap;

import com.techmojo.app.pojo.Student;
import com.techmojo.app.service.StudentsService;

public class StudentsServiceImpl implements StudentsService {


	HashMap<Integer, Student> stdDb = new HashMap<Integer, Student>();

	@Override
	public void create(Student student) {

		stdDb.put(student.getId(), student);

	}


}
