package com.schoolHubApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.schoolHubApplication.entity.Student;
import com.schoolHubApplication.entity.Teacher;
import com.schoolHubApplication.service.ISchoolService;

@RestController
@RequestMapping("/api/school")
public class SchoolController {
	  @Autowired
	  private ISchoolService schoolService;
	
	   // fetch students from multiple branches
	  @GetMapping("/students")
	  public List<Student> getStudents(@RequestParam List<String> branches) {
	        return schoolService.getStudentsByBranches(branches);
	  }

	   // fetch teachers from multiple branches
	  @GetMapping("/teachers")
	  public List<Teacher> getTeachers(@RequestParam List<String> branches) {
	     return schoolService.getTeachersByBranches(branches);
	  }
	

}
