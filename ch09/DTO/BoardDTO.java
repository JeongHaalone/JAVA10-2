package ch09.DTO;



public class BoardDTO {

	private int boardNo;//게시물번호
	private String title;//제목
	private String content;//내용
	private String userName;//작성자
	private String regDate;//작성날짜
//	private FreeBoardService freeBoardService;
//	private FoodBoardService foodBoardService;
//	private QABoardService qaBoardService;
//	private ItemBoardService itemBoardService;

	

	public int getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}


	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
//	public FreeBoardService getFreeBoardService() {
//		return freeBoardService;
//	}
//	public void setFreeBoardService(FreeBoardService freeBoardService) {
//		this.freeBoardService = freeBoardService;
//	}
//	public FoodBoardService getFoodBoardService() {
//		return foodBoardService;
//	}
//	public void setFoodBoardService(FoodBoardService foodBoardService) {
//		this.foodBoardService = foodBoardService;
//	}
//	public QABoardService getQaBoardService() {
//		return qaBoardService;
//	}
//	public void setQaBoardService(QABoardService qaBoardService) {
//		this.qaBoardService = qaBoardService;
//	}
//	public ItemBoardService getItemBoardService() {
//		return itemBoardService;
//	}
//	public void setItemBoardService(ItemBoardService itemBoardService) {
//		this.itemBoardService = itemBoardService;
//	}

	public BoardDTO() {
	}

	public BoardDTO(int boardNo, String title, String content, String regDate) {
		
		this.boardNo = boardNo;
		this.title = title;
		this.content = content;
		this.userName = userName;
		this.regDate = regDate;
//		this.freeBoardService = freeBoardService;
//		this.foodBoardService = foodBoardService;
//		this.qaBoardService = qaBoardService;
//		this.itemBoardService = itemBoardService;
	}

}
