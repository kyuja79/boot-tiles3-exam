package com.gaebalja.boottiles3exam.biz.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gaebalja.boottiles3exam.biz.member.service.MemberService;
import com.gaebalja.boottiles3exam.biz.member.vo.Member;

@Controller
@RequestMapping("/member")
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	
}
