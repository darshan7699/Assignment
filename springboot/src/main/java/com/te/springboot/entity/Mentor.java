package com.te.springboot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

import lombok.Data;

@Entity
@Data
@Component
public class Mentor {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	private Integer srNo;
	private String name;
	private String skills;
	private String mail;
	private Integer yoe;
}
