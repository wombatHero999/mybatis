package com.kh.mybatis.student.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.mybatis.student.model.service.StudentServiceImpl;

/**
 * Servlet implementation class InsertMapStudentController
 */
@WebServlet("/student/insertStudentMap")
public class InsertMapStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String tel = request.getParameter("tel");
		Map<String,Object> param = new HashMap<>();
		param.put("name", name);
		param.put("tel", tel);
		
		int result = new StudentServiceImpl().insertStudentMap(param);
		
		if(result > 0) {
			request.getSession().setAttribute("msg", "Map형식으로 데이터 등록 성공");
		}else {
			request.getSession().setAttribute("msg", "Map형식으로 데이터 등록 실패 ㅠㅠ");			
		}
		response.sendRedirect(request.getContextPath()+"/student/insertStudent");
	}

}









