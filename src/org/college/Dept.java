package org.college;

public class Dept extends Hostel {
public void deptName(){
	System.out.println("deptName");
}
public static void main(String[] args) {
	Dept dp = new Dept();
	dp.deptName();
	dp.hostelName();
	
}
}
