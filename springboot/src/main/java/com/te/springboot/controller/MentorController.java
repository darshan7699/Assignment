package com.te.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.te.springboot.entity.Mentor;
import com.te.springboot.entity.Trainee;
import com.te.springboot.service.MentorInterface;

@RestController
public class MentorController {

	@Autowired
	MentorInterface interface1;
	
	
	@PostMapping("/addtr")
	public Mentor add(@RequestBody Mentor mentor) {
		Mentor add = interface1.add(mentor);
		return add;
		
	}
	
}
