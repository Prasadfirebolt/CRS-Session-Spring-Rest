package com.hexagon.service;

import java.util.List;

public interface Professor {
	public void addGrades(String courseId, String studentId, String grade);
	
	public List<String> viewEnrolledStudents(String courseId);

}
