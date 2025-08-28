package com.schoolHubApplication.common;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="Student")
public class Student {
	
	@Id
	@Column(name="sid")
	private Integer studentId;
	@Column(name="sid")
	private String firstName;
	@Column(name="sid")
	private String lastName;
	private String email;
	private String gradeLevel;
	private Date dateOfBirth;
	private String contactNumber;
	private String address;
	private String enrollmentDate;
	private List<String> Courses;
	private Double gpa;
	private List<AttendanceRecord> attendanceRecords;
	private ParentContact parentContact;
	private String profilePhoto;
	
}
