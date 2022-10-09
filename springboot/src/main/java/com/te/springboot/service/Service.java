package com.te.springboot.service;

import com.te.springboot.dto.BatchDto;
import com.te.springboot.dto.UpdateDtoMentor;
import com.te.springboot.dto.UpdateDtoTrainee;
import com.te.springboot.entity.Batch;
import com.te.springboot.entity.Trainee;

public interface Service {

	void initialize(Batch batch);

	Batch inject(UpdateDtoMentor dto);

	Batch injTrainee(UpdateDtoTrainee dtoTrainee);

	Batch in(BatchDto batchDto);

}
