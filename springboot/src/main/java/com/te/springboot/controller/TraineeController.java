package com.te.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.te.springboot.entity.Trainee;
import com.te.springboot.service.TraineeInterface;

@RestController
public class TraineeController {

	
	@Autowired
	TraineeInterface traineeInterface;
	
	@PostMapping("/dharshan")
	public Trainee add(@RequestBody Trainee trainee) {
		Trainee add = traineeInterface.add(trainee);
		return add;
	}
	
	
	@PostMapping("/upd")
	public Trainee update(@RequestBody Trainee trainee) {
		Trainee update = traineeInterface.update(trainee);
		return update;
		
	}
	
}
