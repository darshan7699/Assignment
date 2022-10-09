package com.te.springboot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Trainee {
   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer srNo;
	private int id;
	private String name;
	private String mail;
	

}
