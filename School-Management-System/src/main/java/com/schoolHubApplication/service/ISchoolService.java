package com.schoolHubApplication.service;

import java.util.List;

import com.schoolHubApplication.entity.Student;
import com.schoolHubApplication.entity.Teacher;

public interface ISchoolService {
	public List<Student> getStudentsByBranches(List<String> branches);
	public List<Teacher> getTeachersByBranches(List<String> branches);

}
