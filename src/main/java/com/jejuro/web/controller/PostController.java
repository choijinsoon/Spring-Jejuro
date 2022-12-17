package com.jejuro.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jejuro.web.entity.Post;

@Controller
@RequestMapping("/post")
public class PostController {

	@GetMapping("/new")
	public String displayPost(Model model) {
		model.addAttribute("post", new Post());
		return "post/new-post";
	}
	
	@PostMapping("/result")
	public String result(Post post) {
		return "post/result";
	}
}
