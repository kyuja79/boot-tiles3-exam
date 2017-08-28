package com.gaebalja.boottiles3exam.biz.member.service;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.gaebalja.boottiles3exam.BootTiles3ExamApplication;
import com.gaebalja.boottiles3exam.biz.member.vo.Member;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = BootTiles3ExamApplication.class)
public class MemberServiceTest {
	
	@Autowired
	private MemberService memberService;
	
	@Before
	public void save(){
		// id, name, email, password
		Member member = new Member(4L, "kyuja", "kyuja@danalssocio.com", "1234");
		memberService.save(member);
	}
	
	@Test
	public void find(){
		Member member = memberService.findById(4L);
		System.out.println(member.toString());
	}
	
	
}
