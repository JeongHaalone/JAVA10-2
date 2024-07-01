package ch09.DTO;

import ch09.service.LoginService;

public class MemberDTO {
	// 필드
	private String id;
	private String pw;
	//private String nickname;
	//public LoginService loginState; 작성자랑 id연동하려다 안씀.
	
	// 생성자

	// 메서드
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}


}
