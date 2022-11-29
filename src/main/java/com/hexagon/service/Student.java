package com.hexagon.service;

import java.util.List;

public interface Student {
	public void registerForCourse(String courseId, String studentId);
	
	public void addCourse(String courseId);
	
	public void dropCourse(String courseId);
	
	public List<String> viewGrades();
	
	public void payFee(String studentId);
}
