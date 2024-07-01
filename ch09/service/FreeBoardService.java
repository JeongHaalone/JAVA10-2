package ch09.service;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

import ch09.DTO.BoardDTO;
import ch09.DTO.MemberDTO;

public class FreeBoardService extends BoardDTO {
	// 필드

	// 생성자

	// 메서드
	public static void menu(Scanner scanner, FreeBoardService[] freeBoardServices, MemberDTO loginState , MemberDTO[] memberDTOs) {
		// 자유게시판
		boolean run = true;
		while (run) {
		System.out.println("1. 게시글 작성 ");
		System.out.println("2. 전체 조회");
		System.out.println("3. 게시글 삭제");
		System.out.println("4. 메인메뉴로");
		
			int select = scanner.nextInt();
			switch (select) {
			case 1:
				System.out.println("게시글을 작성해주세요.");
				FreeBoardService.write(scanner, freeBoardServices, memberDTOs, loginState);//아직 미완
				break;
			case 2:
				System.out.println("전체 게시글을 조회합니다.");
				FreeBoardService.read(scanner, freeBoardServices, memberDTOs);
				break;
			case 3:
				System.out.println("게시글을 삭제하세요.");
				FreeBoardService.delete(scanner, freeBoardServices, memberDTOs, loginState);
				break;
			case 4:
				System.out.println("메인메뉴로 돌아갑니다.");
				run = false;
				break;
			default:
				System.out.println("1~4값을 입력해주세요.");
			}// switch
		} // while

	}// freeBoardmenu
		
	// 생성자

	// 메서드
	public static void write(Scanner scanner, FreeBoardService[] freeBoardServices, MemberDTO[] memberDTOs, MemberDTO loginState) {
		System.out.println("작성할 게시글의 제목을 입력해주세요.");
		System.out.print(">>>");
		String newTitle = scanner.next();//게시글 키보드 입력
		System.out.println("작성할 게시글을 입력해주세요.");
		System.out.print(">>>");
		String newContent = scanner.next();//게시글 키보드 입력
		//if 로그인 한 상태면 그 사람의 정보 를 저장..? 
		
		int newBoardNo = 1;
	    for (int j =0;j <freeBoardServices.length; j++ ) {
	        
	            FreeBoardService newBoard = new FreeBoardService();
	            newBoard.setBoardNo(newBoardNo);
	            newBoard.setTitle(newTitle);
	            newBoard.setContent(newContent);
	            
	            newBoard.setRegDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
	            if (loginState != null) {
	            	newBoard.setUserName(loginState.getId());
	            } else {
	                newBoard.setUserName("익명"); //로그인 안했으면 익명
	            }
	            
	            for(int i = 0; i<freeBoardServices.length; i++) {
	            	if(freeBoardServices[i]==null) {
	            		freeBoardServices[i]=newBoard;
	            		System.out.println(freeBoardServices[i].getContent()+"입력됨");
	            		break;
	            	
	            }
	        }//if close
	        newBoardNo++;
	        break;
	    }//for close
	}//write method close

	public static void read(Scanner scanner, FreeBoardService[] freeBoardServices , MemberDTO[] memberDTOs) {
		for (int i = 0; i < freeBoardServices.length; i++) {
			if(freeBoardServices[i] !=null) {
				System.out.printf("작성자 : " + freeBoardServices[i].getUserName() + freeBoardServices[i].getBoardNo() + ". " + " 제목 : " + freeBoardServices[i].getTitle()
						+ "\n 작성일 : " + freeBoardServices[i].getRegDate() + "\n 작성 내용 : " + freeBoardServices[i].getContent());	
			}
		
		break;
		} // for
	}// read close

	public static void delete(Scanner scanner, FreeBoardService[] freeBoardServices, MemberDTO[] memberDTOs, MemberDTO loginState) {
		System.out.println("삭제하실 계정의 아이디를 입력해주세요.");
		System.out.print(">>>");
		String deleteid = scanner.next();
		for (int i =0; i <freeBoardServices.length; i++) {
			if (freeBoardServices != null &&  memberDTOs[i].getId().equals(deleteid)) {
				freeBoardServices[i] =  null;//게시물 정보 삭제일까
				break;
			}//if
		}//for
	}//delete close

}// class close
