package com.schoolHub;

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

/*Imagine a school has multiple branches:
Branch A → Located in Hyderabad
Branch B → Located in Vizag
Branch C → Located in Srikakulam
*Each branch has its own students, teachers, and classes, 
	but all are connected to the main 'school database'.
*1. Branch Table
	Holds details of each school branch.
	
*branch_id	branch_name		location
1			Branch A		  Hyderabad
2			Branch B		  Vizag
3			Branch C		  Srikakulam

student_id	student_name	grade	branch_id
1				Ramesh		5th			1				Branch A
2				Anita		6th			2				Branch B
3				Kiran		5th			1				Branch A

teacher_id	teacher_name	subject	branch_id
1			Suresh			Maths		1
2			Meena			Science		2
3			Anil			English		3

class_id	class_name	branch_id
1			5th A		1
2			6th A		1
3			5th A		2

==>branch_id connects branch → student, branch → teacher, and branch → class.
✅ Summary:
Branch table is the center.
Students, Teachers, Classes are connected via branch_id.
This allows you to manage multiple school branches in one single database.
3. Connectivity Explanation
Branch → Class: one branch has many classes
Class → Student: one class has many students
Branch → Teacher: one branch has many teachers
So, the connectivity is hierarchical:
Branch → Class → Student
Branch → Teacher
	
	 Branch (branch_id, branch_name, location)
     |
     |---< Class (class_id, class_name, branch_id)
     |          |
     |          |---< Student (student_id, student_name, grade, class_id)
     |
     |---< Teacher (teacher_id, teacher_name, subject, branch_id)
Explanation:
Each Branch can have multiple Classes and Teachers.
Each Class can have multiple Students.
Students are indirectly connected to a Branch through their Class.

*
*
*
*/