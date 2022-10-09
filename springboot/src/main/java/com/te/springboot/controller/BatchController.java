package com.te.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.te.springboot.dto.BatchDto;
import com.te.springboot.dto.UpdateDtoMentor;
import com.te.springboot.dto.UpdateDtoTrainee;
import com.te.springboot.entity.Batch;
import com.te.springboot.service.Service;

@RestController
public class BatchController {

	@Autowired
	Service service;

	@PostMapping("/in")
	public String initialize(@RequestBody Batch batch) {
		service.initialize(batch);
		return "done";
	}

	// set mentor for the batch
	@PostMapping("/inject")
	public Batch inject(@RequestBody UpdateDtoMentor dto) {
		Batch inject = service.inject(dto);
		return inject;
	}

	// set trainee for batch
	@PostMapping("/inj")
	public Batch injTrainee(@RequestBody UpdateDtoTrainee dtoTrainee) {
		Batch trainee = service.injTrainee(dtoTrainee);
		return trainee;
	}

	// set with mentor and tarinee
	@PostMapping("/create")
	public Batch in(@RequestBody BatchDto batchDto) {
        Batch in = service.in(batchDto);
        return in;
	}
}
