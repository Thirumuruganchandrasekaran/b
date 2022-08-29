package org.college;

public class Hostel extends Student
{
public void hostelName(){
	System.out.println("hostelName");
}
public static void main(String[] args) {
	Hostel h = new Hostel();
	h.hostelName();
	h.studentDept();
	h.studentId();
	h.studentName();
	
}
}
