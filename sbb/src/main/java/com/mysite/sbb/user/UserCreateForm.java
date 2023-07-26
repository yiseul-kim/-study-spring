package com.mysite.sbb.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserCreateForm {
	// Client 에서 넘어오는 모든 필드를 한꺼 번에 주입 : 
	// 필드의 값에 대한 유효성 체크
	
	@NotEmpty(message="사용자 ID는 필수 입력 사항입니다.")
	@Size(min=3, max=25)
	private String username;
	
	@NotEmpty(message="사용자 password는 필수 입력 사항입니다.")
	private String password1;
	
	@NotEmpty(message="사용자 password 확인은 필수 입력 사항입니다.")
	private String password2;
	
	@NotEmpty(message="사용자 email 주소는 필수 입력 사항입니다.")
	@Email						// aaaa@aaa.com 이메일 형식이 맞는지 확인
	private String email;
	
}
