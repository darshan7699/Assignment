package com.te.springboot.dto;

import java.util.List;

import com.te.springboot.entity.Trainee;

import lombok.Data;

@Data
public class BatchDto {
	
	private Integer id;
	private String batchName;
	private String status;
	private String startDate;
	private String endDate;
	
	private int srNo;
	
	private List<Integer> no;
	
	
}
