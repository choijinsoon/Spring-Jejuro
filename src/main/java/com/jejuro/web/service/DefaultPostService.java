package com.jejuro.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jejuro.web.dao.PostDao;
import com.jejuro.web.entity.Post;

@Service
public class DefaultPostService implements PostService{
	
	@Autowired
	private PostDao dao;

	@Override
	public void add(Post post) {
		dao.insert(post);		
	}

	@Override
	public List<Post> getList() {
		return dao.getList();
	}
	
}
