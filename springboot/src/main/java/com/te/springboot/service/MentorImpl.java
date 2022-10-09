package com.te.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.springboot.entity.Mentor;
import com.te.springboot.entity.Trainee;
import com.te.springboot.repo.MentorRepo;

@Service
public class MentorImpl implements MentorInterface {

	@Autowired
	MentorRepo mentorRepo;

	@Override
	public Mentor add(Mentor mentor) {
		Mentor save = mentorRepo.save(mentor);
		return save;
	}

}
