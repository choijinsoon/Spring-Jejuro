package com.jejuro.web.service;

import com.jejuro.web.entity.Member;

public interface MemberService {
	void add(Member member);

	Member get(String email);

	void delete(String email);

	void update(Member member);
}
