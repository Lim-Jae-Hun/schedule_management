package kr.co.zzaehoonx2.member.persistence.impl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.zzaehoonx2.member.persistence.IMemberDAO;

@Repository
public class MemberDAOImpl implements IMemberDAO{
	
	@Autowired
	private SqlSession sqlSession;
	
}
