package com.te.springboot.service;

import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.springboot.entity.Trainee;
import com.te.springboot.repo.TraineeRepo;

@Service
public class TarineeSerImpl implements TraineeInterface{

	@Autowired
	TraineeRepo repo;
	
	@Override
	public Trainee add(Trainee trainee) {
		Trainee save = repo.save(trainee);
		return save;
	}


	@Override
	public Trainee update(Trainee trainee) {
		System.out.println(trainee.getSrNo());
		Trainee trainee2 = repo.findById(trainee.getSrNo()).get();
		 trainee2.setName(trainee.getName());
		 trainee2.setMail(trainee.getMail());
		 Trainee save = repo.save(trainee2);
		return save;
	}

	
	
	
}
