package com.jejuro.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jejuro.web.entity.Post;
import com.jejuro.web.service.PostService;

@Controller
@RequestMapping("/post")
public class PostController {
	
	@Autowired
	private PostService postService;
	
	@GetMapping("/list")
	public String displayPostList(Model model) {
		List<Post> postList = postService.getList();
		model.addAttribute("postList", postList);
		return "post/list";
	}

	@GetMapping("/new")
	public String displayPost(Model model) {
		model.addAttribute("post", new Post());
		return "post/new-post";
	}
	
	@PostMapping("/result")
	public String result(Post post) {
		postService.add(post);
		return "post/result";
	}
}
