package org.college;

public class Student extends College{
public void studentName(){
	System.out.println("studentName is john");
}
public void studentDept(){
	System.out.println("studentDept");
}
public void studentId(){
	System.out.println("studenntId");
}
public static void main(String[] args) {
	Student std = new Student();
	std.studentName();
	std.studentDept();
	std.studentId();
	std.collegeName();
	std.collegeCode();
	std.collegeRank();
 
}
}
