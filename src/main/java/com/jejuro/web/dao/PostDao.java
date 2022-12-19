package com.jejuro.web.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.jejuro.web.entity.Post;

@Mapper
public interface PostDao {

	public void insert(Post post);

	public List<Post> getList();
	
}
