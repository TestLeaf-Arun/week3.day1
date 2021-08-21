package org.student;
import org.department.Department;

public class Student extends Department {
	
	public void studentName() {
		System.out.println("Student Name is Arun");
	}
	
	public void studentDept() {
		System.out.println("Student is part of Electronics and Communications Department");
	}
	
	public void studentId() {
		System.out.println("Student ID is 555");
	}
	
	public static void main(String[] args) {
		Student studObj = new Student();
		studObj.collegeName();
		studObj.collegeCode();
		studObj.collegeRank();
		studObj.deptName();
		studObj.studentName();
		studObj.studentDept();
		studObj.studentId();
	}
}