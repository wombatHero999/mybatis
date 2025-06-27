package com.kh.mybatis.common.filter;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionTemplate {
	/* 
	 * 어플리케이션 시작시 SqlSessionFactory를 1회만 생성하여 재사용하도록 코드를 작성
	 * */
	private static SqlSessionFactory sqlSessionFactory;
	
	// 스태틱 초기화 블럭 : 현재 클래스가 로딩되는 시점에서 단 1번 실행
	static {
		String resource = "/mybatis-config.xml";
		try(InputStream input = Resources.getResourceAsStream(resource);){
		 	sqlSessionFactory = new SqlSessionFactoryBuilder().build(input);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// sqlSession반환 메서드
	public static SqlSession getSession() {
		return sqlSessionFactory.openSession(false); // 수동커밋설정
	}
}








