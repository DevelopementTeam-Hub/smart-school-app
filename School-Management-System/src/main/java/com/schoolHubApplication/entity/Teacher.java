package com.schoolHubApplication.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Teacher {

	@Id
	@Column(name="TEACHER_ID")
	private Long teacher_id;
	
	private String teacher_name;
	
	private String subject;
	
	 @ManyToOne
	 @JoinColumn(name="branch_id")
	 private Branch branch;



}
