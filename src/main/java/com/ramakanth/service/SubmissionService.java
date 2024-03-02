package com.ramakanth.service;

import java.util.List;

import com.ramakanth.entity.Submission;

public interface SubmissionService {

	public List<Submission> getSubmissions(Integer sessionId);
	public void addSubmission(Submission sub);
}
