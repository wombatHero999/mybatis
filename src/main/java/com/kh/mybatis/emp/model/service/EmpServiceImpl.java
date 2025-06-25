package com.kh.mybatis.emp.model.service;


import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.kh.mybatis.emp.model.dao.EmpDao;
import com.kh.mybatis.emp.model.dao.EmpDaoImpl;

public class EmpServiceImpl implements EmpService {

	private EmpDao empDao = new EmpDaoImpl();

	@Override
	public List<Map<String, Object>> selectAllEmp() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> search1(Map<String, Object> param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> search2(Map<String, Object> param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, String>> selectJobList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> search3(Map<String, Object> param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, String>> selectDeptList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> selectOneEmp(String empId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateEmp(Map<String, String> param) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
	

}
