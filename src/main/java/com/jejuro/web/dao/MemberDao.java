package com.jejuro.web.dao;

import org.apache.ibatis.annotations.Mapper;

import com.jejuro.web.entity.Member;

@Mapper
public interface MemberDao {
	void insert(Member member);
}
