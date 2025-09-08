package com.schoolHubApplication.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Teacher {
	
	@Id
	@Column(name="TEACHER_ID")
	private Long teacher_id;
	
	private String teacher_name;
	
	private String subject;
	
	private Branch branch;

}
