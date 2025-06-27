package com.kh.mybatis.student.model.service;

import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.kh.mybatis.common.filter.SqlSessionTemplate;
import com.kh.mybatis.student.model.dao.StudentDao;
import com.kh.mybatis.student.model.dao.StudentDaoImpl;
import com.kh.mybatis.student.model.vo.Student;

public class StudentServiceImpl implements StudentService {
	
	private StudentDao dao = new StudentDaoImpl();
	
	@Override
	public int insertStudent(Student s) {
		SqlSession session = SqlSessionTemplate.getSession();
		int result = 0;
		try {
			result = dao.insertStudent(session , s);
			session.commit();
		}catch(Exception e) {
			session.rollback();
		} finally {
			session.close();
		}
		
		return result;
	}

	public int insertStudentMap(Map<String, Object> param) {
		SqlSession session = SqlSessionTemplate.getSession();
		int result = dao.insertStudentMap(session, param);
		
		session.commit();
		session.close();
		return result;
	}

	@Override
	public int selectStudentCount() {
		SqlSession session = SqlSessionTemplate.getSession();
		int total = dao.selectStudentCount(session);
		session.close();
		
		return total;
	}

	@Override
	public Student selectOneStudent(int no) {
		SqlSession session = SqlSessionTemplate.getSession();
		Student s = dao.selectOneStudent(session , no);
		session.close();
		return s;
	}

	public int updateStudent(Student s) {
		SqlSession session = SqlSessionTemplate.getSession();
		
		int result = dao.updateStudent(session, s);
		if(result > 0) {
			session.commit();
		}else {
			session.rollback();
		}
		session.close();
		
		return result;
	}
	
	
}








