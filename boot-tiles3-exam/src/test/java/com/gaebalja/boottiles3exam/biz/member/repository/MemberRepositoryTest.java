package com.gaebalja.boottiles3exam.biz.member.repository;

import java.util.ArrayList;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

import com.gaebalja.boottiles3exam.BootTiles3ExamApplication;
import com.gaebalja.boottiles3exam.biz.member.vo.Member;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = BootTiles3ExamApplication.class)
public class MemberRepositoryTest {

	@Inject
	private MemberRepository memberRepository;
	
//	@Before
	public void save(){
		// id, name, email, password
//		Member member = new Member("kyuja", "kyuja@danalssocio.com", "1234");
//		memberRepository.save(member);
		
		ArrayList<Member> members = new ArrayList<>();
		members.add(new Member("kyuja", "kyuja1@danalssocio.com", "1234"));
		members.add(new Member("kyuja", "kyuja2@danalssocio.com", "1234"));
		members.add(new Member("kyuja", "kyuja3@danalssocio.com", "1234"));
		members.add(new Member("kyuja", "kyuja4@danalssocio.com", "1234"));
		members.add(new Member("kyuja", "kyuja5@danalssocio.com", "1234"));
		members.add(new Member("kyuja", "kyuja6@danalssocio.com", "1234"));
		members.add(new Member("kyuja", "kyuja7@danalssocio.com", "1234"));
		members.add(new Member("kyuja", "kyuja8@danalssocio.com", "1234"));
		members
			.stream()
			.forEach(member -> memberRepository.save(member));
	}
	
	@Test
	public void findAll(){
		System.out.println("findAll");
		for(Member member : memberRepository.findAll()) {
			System.out.println(member.toString());
		}
	}
	
	@Test
	public void findAllPage(){
		System.out.println("findAllPage");
		for(Member member : memberRepository.findAll(new PageRequest(0,5))) {
			System.out.println(member.toString());
		}
	}
	
	@Test
	public void findAllSortPage(){
		System.out.println("findAllSortPage");
		PageRequest pageRequest = new PageRequest(0, 5, new Sort(Sort.Direction.DESC, "id")); 
		for(Member member : memberRepository.findAll(pageRequest)) {
			System.out.println(member.toString());
		}
	}
	
	@Test
	public void findByName(){
		System.out.println("findByName");
		for(Member member : memberRepository.findByName("kyuja")) {
			System.out.println(member.toString());
		}
	}
	
	@Test
	public void findByNamePage(){
		System.out.println("findByNamePage");
		for(Member member : memberRepository.findByName("kyuja", new PageRequest(0, 5))) {
			System.out.println(member.toString());
		}
	}
	
	@Test
	public void findByNameSortPage(){
		System.out.println("findByNameSortPage");
		//현재페이지, 조회할 페이지수, 정렬정보
		PageRequest pageRequest = new PageRequest(0, 5, new Sort(Sort.Direction.DESC, "id")); 
		Page<Member> result = memberRepository.findByName("kyuja", pageRequest);
		System.out.println("size = " + result.getSize());
		for(Member member : result.getContent()){
			System.out.println(member.toString());
		}
	}
	
	@Test
	public void findById(){
		System.out.println("findById");
		Long id = 3L;
		Member member = memberRepository.findOne(id);
		System.out.println(member.toString());
	}
	
}
