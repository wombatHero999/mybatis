package com.kh.mybatis.student.model.service;

import com.kh.mybatis.student.model.vo.Student;

public interface StudentService {

	int insertStudent(Student s);

	int selectStudentCount();

	Student selectOneStudent(int no);
}
