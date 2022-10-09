package com.te.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.te.springboot.entity.Mentor;

public interface MentorRepo extends JpaRepository<Mentor, Integer> {

}
