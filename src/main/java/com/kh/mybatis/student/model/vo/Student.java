package com.kh.mybatis.student.model.vo;

import java.util.Date;
import java.util.List;

public class Student {
	private int no;
	private String name;
	private String tel;
	private Date regDate; // java.util.Date
	
	private Student s;
	private List<Student> arr;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int no, String name, String tel, Date regDate) {
		super();
		this.no = no;
		this.name = name;
		this.tel = tel;
		this.regDate = regDate;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", tel=" + tel + ", regDate=" + regDate + "]";
	}
	
}
