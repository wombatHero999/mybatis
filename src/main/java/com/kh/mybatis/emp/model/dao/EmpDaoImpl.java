package com.kh.mybatis.emp.model.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

public class EmpDaoImpl implements EmpDao {

	@Override
	public List<Map<String, Object>> selectAllEmp(SqlSession session) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> search1(SqlSession session, Map<String, Object> param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> search2(SqlSession session, Map<String, Object> param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, String>> selectJobList(SqlSession session) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> search3(SqlSession session, Map<String, Object> param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, String>> selectDeptList(SqlSession session) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> selectOneEmp(SqlSession session, String empId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateEmp(SqlSession session, Map<String, String> param) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
