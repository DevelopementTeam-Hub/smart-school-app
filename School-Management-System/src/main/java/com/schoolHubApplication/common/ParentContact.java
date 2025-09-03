package com.schoolHubApplication.common;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable  //without creating any Table Embeddable table will be generated
@Data
public class ParentContact {
	private String name;
	private String relation;
	private String phoneNumber;
	private String email;

}
