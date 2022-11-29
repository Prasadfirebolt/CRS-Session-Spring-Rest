package com.hexagon.service;

import java.util.List;

public interface Admin {
	public List<String> generateReportCard(String studentId);
	
	public void addProfessor(String professorId);
	
	public void approveStudentRegistration(String courseId, String studentId);
	
	public void addCourse(String courseId);
	
	public void removeCourse(String courseId);

}
