package com.te.springboot.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.te.springboot.dto.BatchDto;
import com.te.springboot.dto.UpdateDtoMentor;
import com.te.springboot.dto.UpdateDtoTrainee;
import com.te.springboot.entity.Batch;
import com.te.springboot.entity.Mentor;
import com.te.springboot.entity.Trainee;
import com.te.springboot.repo.BatchRepo;
import com.te.springboot.repo.MentorRepo;
import com.te.springboot.repo.TraineeRepo;

@org.springframework.stereotype.Service
public class BatchService implements Service {

	@Autowired
	BatchRepo repo;

	@Autowired
	MentorRepo mentorRepo;

	@Autowired
	TraineeRepo traineeRepo;

	@Autowired
	Batch batch;

	@Override
	public void initialize(Batch batch) {
		repo.save(batch);
	}

	// set mentor for the batch
	@Override
	public Batch inject(UpdateDtoMentor dto) {
		Batch batch2 = repo.findById(dto.getSrNo()).get();
		Mentor mentor = mentorRepo.findById(dto.getNo()).get();
		batch2.setMentor(mentor);
		Batch save = repo.save(batch2);
		return save;
	}

	// set trainee for batch
	@Override
	public Batch injTrainee(UpdateDtoTrainee dtoTrainee) {
		Batch batch = repo.findById(dtoTrainee.getSrNo()).get();
		Trainee trainee = traineeRepo.findById(dtoTrainee.getNo()).get();
		List<Trainee> trainee2 = batch.getTrainee();
		trainee2.add(trainee);
		batch.setTrainee(trainee2);
		Batch save = repo.save(batch);
		return save;
	}

	// batch with mentor and trainee
	@Override
	public Batch in(BatchDto batchDto) {
		batch.setBatchName(batchDto.getBatchName());
		batch.setEndDate(batchDto.getEndDate());
		batch.setId(batchDto.getId());
		batch.setStartDate(batchDto.getStartDate());
		batch.setStatus(batchDto.getStatus());

		Mentor mentor = mentorRepo.findById(batchDto.getSrNo()).get();
		batch.setMentor(mentor);

		List<Trainee> list = new ArrayList();

		List<Integer> no = batchDto.getNo();

		for (int i = 0; i < no.size(); i++) {
			Optional<Trainee> findById = traineeRepo.findById(no.get(i));
			Trainee trainee = findById.get();
			list.add(trainee);
		}
		System.out.println(list);
		batch.setTrainee(list);
		return repo.save(batch);

	}

}
