package com.kh.mybatis.student.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kh.mybatis.student.model.service.StudentService;
import com.kh.mybatis.student.model.service.StudentServiceImpl;
import com.kh.mybatis.student.model.vo.Student;

@WebServlet("/student/insertStudent")
public class InsertStudentController extends HttpServlet{
	
	private StudentService service = new StudentServiceImpl();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.getRequestDispatcher("/student/insertStudent.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 학생정보 insert(핵심로직)
		
		// 1. 사용자가 전송한 데이터 가공처리
		String name = req.getParameter("name");
		String tel  = req.getParameter("tel");
		Student s = new Student();
		s.setName(name);
		s.setTel(tel);
		
		// 2. service메서드 호출
		int result = service.insertStudent(s);
		
		// 3. 처리결과에 따른 응답처리
		if(result > 0) {
			// 데이터삽입 성공
			// 서비스 처리결과 메세지 추가
			req.getSession().setAttribute("msg", "학생 등록 성공 ^^");
			// 리다이렉트(request 초기화)
			resp.sendRedirect(req.getContextPath()+"/student/insertStudent");
		}else {
			req.getSession().setAttribute("msg", "학생 등록 실패 ㅠㅠ");
			resp.sendRedirect(req.getContextPath()+"/student/insertStudent");
		}
	}
	
	
}







