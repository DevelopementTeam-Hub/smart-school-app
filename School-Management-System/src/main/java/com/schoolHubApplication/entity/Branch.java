package com.schoolHubApplication.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="BRANCH")
public class Branch {
	@Id
	@SequenceGenerator(name="seq",initialValue = 056,allocationSize = 1)
	@GeneratedValue(generator="seq",strategy=GenerationType.SEQUENCE )
	@Column(name="BRANCH_ID")
	private Long branch_id;
	
	@Column(name="BRANCH_NAME")
	private String branch_name;
	
	@Column(name="LOCATION")
	private String location;
}
