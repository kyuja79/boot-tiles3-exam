package com.gaebalja.boottiles3exam.biz.member.service;

import javax.inject.Inject;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import com.gaebalja.boottiles3exam.BootTiles3ExamApplication;
import com.gaebalja.boottiles3exam.biz.member.vo.Member;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = BootTiles3ExamApplication.class)
public class MemberServiceTest {
	
	@Inject
	private MemberService memberService;
	
	@Before
	public void save(){
		// id, name, email, password
		Member member = new Member("kyuja", "kyuja@danalssocio.com", "1234");
		memberService.save(member);
	}
	
	@Test
	public void find(){
		Member member = memberService.findById(3L);
		System.out.println(member.toString());
	}
	
	@Test
	public void findByName(){
		PageRequest page = new PageRequest(0, 5);
		Page<Member> members = memberService.findByName("kyuja", page);
		System.out.println(members.toString());
	}
	
	
	
}
