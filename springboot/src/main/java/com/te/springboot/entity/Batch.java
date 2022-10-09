package com.te.springboot.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Entity
@Component
public class Batch {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer srNo;
	private Integer id;
	private String batchName;
	private String status;
	private String startDate;
	private String endDate;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Mentor mentor;
	
	@OneToMany(cascade = CascadeType.ALL)
	private  List<Trainee> trainee;

}
