package com.schoolHubApplication.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.schoolHubApplication.entity.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {
	// fetch students by single branch
    List<Student> findByBranch_BranchName(String branchName);

    // fetch students by multiple branches
    List<Student> findByBranch_BranchNameIn(List<String> branchNames);
}
