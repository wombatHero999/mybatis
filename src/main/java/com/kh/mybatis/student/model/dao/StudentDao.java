package com.kh.mybatis.student.model.dao;

import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.kh.mybatis.student.model.vo.Student;

public interface StudentDao {

	int insertStudent(SqlSession session, Student s);

	int insertStudentMap(SqlSession session, Map<String, Object> param);

	int selectStudentCount(SqlSession session);

	Student selectOneStudent(SqlSession session, int no);

	int updateStudent(SqlSession session, Student s);

}








