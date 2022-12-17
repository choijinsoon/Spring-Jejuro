package com.jejuro.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jejuro.web.entity.Member;
import com.jejuro.web.service.MemberService;

@Controller
@RequestMapping("/member")
public class MemberController {
	
	@Autowired
	private MemberService service;

	@GetMapping("/register")
	public String register(Model model) {
		model.addAttribute("member", new Member());
		return "member/sign-in";
	}
	
	@PostMapping("/result")
	public String result(Member member) {
		service.add(member);
		return "member/myinfo";
	}
}
