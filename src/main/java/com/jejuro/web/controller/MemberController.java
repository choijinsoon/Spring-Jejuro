package com.jejuro.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	@PostMapping("/myinfo")
	public String result(Member member) {
		service.add(member);
		String result = "redirect:/member/myinfo/"+member.getEmail();
		return result;
	}

	@GetMapping("/myinfo/{email}")
	public String myinfo(@PathVariable("email") String email,
						Model model) {
		Member member = service.get(email);
		model.addAttribute("member", member);
		return "member/myinfo";
	}
	
	@PostMapping("/myinfo/{email}")
	public String Displaymyinfo(@PathVariable("email") String email) {
		service.get(email);
		return "member/myinfo";
	}
	
	@PostMapping("/myinfo/delete")
	public String delete(@RequestParam("email") String email) {
		service.delete(email);
		return "redirect:/member/register";
	}
	
	@GetMapping("/myinfo/update/{email}")
	public String updatePage(@PathVariable("email") String email,
							Model model) {
//		service.get(email);
		model.addAttribute("member", new Member(email));
		return "member/update";
	}
	
	@PostMapping("/myinfo/update")
	public String update(Member member) {
		service.update(member);
		String result = "redirect:/member/myinfo/"+member.getEmail();
		return result;
	}

	@GetMapping("/alarm/{email}")
	public String alarm(@PathVariable("email") String email,
						Model model) {
		Member member = service.get(email);
		model.addAttribute("member", member);
		return "member/myinfo";
	}
	
	@PostMapping("/myinfo/{email}")
	public String Displayalarm(@PathVariable("email") String email) {
		service.get(email);
		return "member/myinfo";
	}


}
