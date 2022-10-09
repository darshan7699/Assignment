package com.te.springboot.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.springboot.entity.Batch;
import com.te.springboot.entity.Trainee;

@Repository
public interface TraineeRepo extends JpaRepository<Trainee, Integer> {

	

}
