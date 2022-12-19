package com.jejuro.web.service;

import java.util.List;

import com.jejuro.web.entity.Post;

public interface PostService {

	void add(Post post);

	List<Post> getList();

}
