package com.kh.mybatis.student.model.dao;

import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.kh.mybatis.student.model.vo.Student;

public class StudentDaoImpl implements StudentDao {

	@Override
	public int insertStudent(SqlSession session, Student s) {
		// insert("namespace.queryTagId" , 바인딩에 필요한 값)
		return session.insert("student.insertStudent", s);
	}

	@Override
	public int insertStudentMap(SqlSession session, Map<String, Object> param) {
		return session.insert("student.insertStudentMap", param);
	}

	@Override
	public int selectStudentCount(SqlSession session) {
		return session.selectOne("student.selectStudentCount");
	}

	@Override
	public Student selectOneStudent(SqlSession session, int no) {
		return session.selectOne("student.selectOneStudent", no);
	}

	@Override
	public int updateStudent(SqlSession session, Student s) {
		return session.update("student.updateStudent", s);
	}
	
}








