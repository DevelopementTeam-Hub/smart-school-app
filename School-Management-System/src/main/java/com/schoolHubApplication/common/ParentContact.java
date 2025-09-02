package com.schoolHubApplication.common;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable  //without creating an object
@Data
public class ParentContact {
	
	private String name;
	private String relation;
	private String phoneNumber;
	private String email;

}
