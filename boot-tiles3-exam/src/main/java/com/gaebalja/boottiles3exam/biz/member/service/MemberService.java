package com.gaebalja.boottiles3exam.biz.member.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.gaebalja.boottiles3exam.biz.member.repository.MemberRepository;
import com.gaebalja.boottiles3exam.biz.member.vo.Member;

@Service
public class MemberService {
	
	@Autowired
	private MemberRepository memberRepo;
	
	public void save(Member member){
		memberRepo.save(member);
	}
	
	public Member findById(Long id){
		return memberRepo.findOne(id);
	}
	
	public List<Member> findByName(String name){
		return memberRepo.findByName(name);
	}
	
	public Page<Member> findByName(String name, Pageable pageable){
		return memberRepo.findByName(name, pageable);
	}
	
	
}
