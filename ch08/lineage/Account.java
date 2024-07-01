package ch08.lineage;

public class Account {
	//필드
	private String id;
	private String pw;
	private String nickname;
	private String server;
	private ElfDTO elfDTO;
	private KnightDTO knightDTO;
	
	
	//생성자
	
	//메서드
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
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getServer() {
		return server;
	}
	public void setServer(String server) {
		this.server = server;
	}
	public ElfDTO getElfDTO() {
		return elfDTO;
	}
	public void setElfDTO(ElfDTO elfDTO) {
		this.elfDTO = elfDTO;
	}
	public KnightDTO getKnightDTO() {
		return knightDTO;
	}
	public void setKnightDTO(KnightDTO knightDTO) {
		this.knightDTO = knightDTO;
	}
	
	
}
