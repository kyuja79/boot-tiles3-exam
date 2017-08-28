package com.gaebalja.boottiles3exam.biz.member.vo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor //추가 모든 필드가 있는 생성자를 만든다.
@NoArgsConstructor  //추가 디폴트 생성자를 만든다. 이놈이 필요한이유는 JPA 덕분 
public class Member implements Serializable {

	private static final long serialVersionUID = -7535878372744219980L;
	
	//	id, name, email, password
	@Id
	@GeneratedValue
	private long id;
	
	@Column
	private String name;
	
	@Column
	private String email;
	
	@Column
	private String password;
	
	public Member(String name, String email, String password) {
		this.name = name;
		this.email = email;
		this.password = password;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString()).append(" id=").append(id).append(", name=").append(name).append(", email=")
				.append(email).append(", password=").append(password);
		return builder.toString();
	}
	
}
