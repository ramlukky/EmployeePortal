package com.ramakanth.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.ramakanth.entity.Submission;

public interface SubmissionRepo extends JpaRepository<Submission, Integer> {

	public List<Submission> findAllByEmpId(Integer empId);
}
