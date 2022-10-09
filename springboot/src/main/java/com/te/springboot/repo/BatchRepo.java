package com.te.springboot.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.te.springboot.dto.UpdateDtoMentor;
import com.te.springboot.entity.Batch;

@Repository
public interface BatchRepo extends CrudRepository<Batch, Integer> {

	UpdateDtoMentor save(UpdateDtoMentor dto);

}
