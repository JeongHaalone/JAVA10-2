package ch06.Store;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Review {

	String productName;
	String review;
	String reviewDate;
	int reviewPoint;
	int reviewNum;
	String reviewId;
	
	public static void tester(Review[] reviews) {

		Review lists1 = new Review();
		lists1.productName = "밤";
		lists1.reviewPoint = 5;
		lists1.review = "맛남 강추";
		lists1.reviewDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
		reviews[0] = lists1;
		
		Review lists2 = new Review();
		lists2.productName ="수박";
		lists2.reviewPoint = 3;
		lists2.review = "시원한데 달지 않음";
		lists2.reviewDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
		reviews[1]=lists2;
		
	}

}
