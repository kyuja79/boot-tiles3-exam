package com.gaebalja.boottiles3exam.biz.member.controller;

import javax.ws.rs.Path;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.gaebalja.boottiles3exam.biz.member.service.MemberService;

@Controller
@Path("/member")
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	
}
