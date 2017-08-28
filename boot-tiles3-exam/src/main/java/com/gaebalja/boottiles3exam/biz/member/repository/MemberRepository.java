package com.gaebalja.boottiles3exam.biz.member.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.gaebalja.boottiles3exam.biz.member.vo.Member;

@RepositoryRestResource
public interface MemberRepository extends PagingAndSortingRepository<Member, Long>{
	
	Page<Member> findByName(String name, Pageable pageable);
	
//	Page<Member> findByName(String name, Sort sort, Pageable pageable );
	
	List<Member> findByName(String name);
}
