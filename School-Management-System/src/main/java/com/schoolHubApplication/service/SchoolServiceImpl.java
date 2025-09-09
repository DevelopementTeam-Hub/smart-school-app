package com.schoolHubApplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.schoolHubApplication.entity.Student;
import com.schoolHubApplication.entity.Teacher;
import com.schoolHubApplication.repository.StudentRepository;
import com.schoolHubApplication.repository.TeacherRepository;

@Service("schoolservice")
public class SchoolServiceImpl implements ISchoolService {
	@Autowired
	private StudentRepository studentRepo;
	@Autowired
	private TeacherRepository teacherRepo;

	@Override
	public List<Student> getStudentsByBranches(List<String> branches) {
		return studentRepo.findByBranch_BranchNameIn(branches);
	}

	@Override
	public List<Teacher> getTeachersByBranches(List<String> branches) {
		return teacherRepo.findByBranch_BranchNameIn(branches);
	}

}
