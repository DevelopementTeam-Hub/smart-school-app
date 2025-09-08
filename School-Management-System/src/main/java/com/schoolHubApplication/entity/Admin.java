package com.schoolHubApplication.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="admin")
public class Admin {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="admin_name",nullable=false)
	private String admin_name ;
}

/*. Why Admin Table?
Admin manages all branches, teachers, students, and classes.
There may be:
Super Admin → controls all branches
Branch Admin → controls only one branch

Super Admin (role = SUPER_ADMIN) → Can manage all branches.
Branch Admin (role = BRANCH_ADMIN, with branch_id) → Manages only that branch’s students, teachers, classes.
	Admin (admin_id, admin_name, email, role, branch_id):
     |
     |--- manages ---> Branch (branch_id, branch_name, location)
             |
             |---< Class (class_id, class_name, branch_id)
             |         |
             |         |---< Student (student_id, student_name, grade, class_id)
             |
             |---< Teacher (teacher_id, teacher_name, subject, branch_id)
             
Admin Table connects directly to Branch.
Super Admin → manages everything (branch_id is NULL).
Branch Admin → manages one branch (branch_id assigned).
*
*/
