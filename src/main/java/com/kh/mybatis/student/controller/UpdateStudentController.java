package com.kh.mybatis.student.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.mybatis.student.model.service.StudentServiceImpl;
import com.kh.mybatis.student.model.vo.Student;

/**
 * Servlet implementation class UpdateStudentController
 */
@WebServlet("/student/updateStudent")
public class UpdateStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 1. 파라미터값을 가공 처리
		int no = Integer.parseInt(request.getParameter("no"));
		String name = request.getParameter("name");
		String tel = request.getParameter("tel");
		Student s = new Student(no, name, tel, null);
		
		// 2. 서비스로직 호출
		int result = new StudentServiceImpl().updateStudent(s);
		
		// 3. 응답화면 설정
		if(result == 0) {
			request.getSession().setAttribute("msg", "일치하는 회원이 없습니다.");
		}else {
			request.getSession().setAttribute("msg", "회원정보 수정 성공!!");
		}
	
		response.sendRedirect(request.getContextPath()+"/student/selectOne");
	
	}

}






