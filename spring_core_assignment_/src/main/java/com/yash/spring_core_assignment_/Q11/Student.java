package com.yash.spring_core_assignment_.Q11;

public class Student {
	
	int rollno;
	String sname;
	String dob;
	String classname;
	String section;
	Result resultobj;

	public Student(int rollno, String sname, String dob, String classname, String section, Result resultobj) {
		super();
		this.rollno = rollno;
		this.sname = sname;
		this.dob = dob;
		this.classname = classname;
		this.section = section;
		this.resultobj = resultobj;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", sname=" + sname + ", dob=" + dob + ", classname=" + classname
				+ ", section=" + section + ", resultobj=" + resultobj.total_marks + "]";
	}

}
