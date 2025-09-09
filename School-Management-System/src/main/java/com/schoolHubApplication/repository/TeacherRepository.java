package com.schoolHubApplication.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.schoolHubApplication.entity.Teacher;

public interface TeacherRepository extends JpaRepository<String,Integer> {
	List<Teacher> findByBranch_BranchName(String branchName);
    List<Teacher> findByBranch_BranchNameIn(List<String> branchNames);
}
