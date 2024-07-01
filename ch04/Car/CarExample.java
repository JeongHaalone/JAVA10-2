package ch04.Car;

import java.util.Scanner;

import chap06.VendingMachine.Admin;

public class CarExample {

    

	public static void main(String[] args) {
        // Scanner 객체 생성
        Scanner input = new Scanner(System.in);

        // 초기 변수 설정
        boolean menu = true;
        int speed = 0;
        final int maxSpeed = 300;
        final int minSpeed = 0;
        boolean engineOn = false;//엔진 (시동) 기본값
        int musicFile = 300;

        System.out.println("BMW가 출고되었습니다.");
        System.out.println("신원 확인을 진행하겠습니다.");
        System.out.println("얼굴을 인식시켜 주세요.");
        System.out.println("---------------------------");

        boolean faceMatch = true; // 얼굴 인식 성공 여부
        boolean eyeValue = true; // 동체 시력 인식 성공 여부

        // 얼굴 인식 확인
        if (faceMatch) {//얼굴 인식에 성공할 경우
            System.out.println("본인 얼굴 확인이 완료되었습니다.");
            System.out.println("---------------------------");
            faceMatch = false; // 얼굴 인식 성공 후 false로 변경
        }

        // 동체 시력 인식 확인
        if (eyeValue) {//동체 인식에 성공할 경우
            System.out.println("동체시력이 인식되었습니다.");
            System.out.println("---------------------------");
            eyeValue = false; // 동체 시력 인식 성공 후 false로 변경

            System.out.println("시동을 걸려면 비밀번호 입력해주세요.");
            String beforePassword = "abcd";
            String passWord = input.next(); // Scanner 객체를 재사용
            if (beforePassword.equals(passWord)) {//문자열을 비교
                System.out.println("시동을 걸겠습니다.");
                engineOn = true;//시동이 걸림
            } else {
                     	System.out.println("비밀번호가 틀렸습니다. 대기모드로 전환합니다.");
                return; // 비밀번호가 틀리면 프로그램 종료
            }
        }

        while (menu && engineOn) {
            // 메뉴 생성
            System.out.println("---------------------------");
            System.out.println("0 : 시동을 종료");
            System.out.println("1 : 가속");
            System.out.println("2 : 감속");
            System.out.println("3 : 멀티미디어");
            System.out.println("4 : 주유소 메뉴");
            System.out.println("---------------------------");
            System.out.println("원하시는 메뉴를 입력해주세요.>>");

            int select = input.nextInt();

            switch (select) {
                case 0:
                    System.out.println("시동을 종료하겠습니다.");
                    menu = false; // 메뉴를 끔
                    engineOn = false; // 시동을 끔
                    break;
                case 1:
                    System.out.println("차가 가속됩니다.");
                    speed += 10; // 속도를 10씩 증가
                    if (speed >= maxSpeed) {
                        speed = maxSpeed; // 최대 속도 초과 방지
                    }
                    System.out.println("지금 이 차의 속도는 " + speed + "km/h 입니다.");
                    break;
                case 2:
                    System.out.println("차가 감속됩니다.");
                    speed -= 10; // 속도를 10씩 감소
                    if (speed <= minSpeed) {
                        speed = minSpeed; // 최소 속도 이하 방지
                    }
                    System.out.println("지금 이 차의 속도는 " + speed + "km/h 입니다.");
                    break;
                case 3:
                    System.out.println("멀티미디어가 켜집니다.");
                    System.out.println("원하시는 멀티미디어를 선택해주세요. (음악 :1, 라디오 :2; 사진:3)");
                    int multi = input.nextInt();
                    switch (multi) {
                    case 1: 
                    	System.out.println("로그인을 진행하겠습니다. ");
        				CarValue newMulti = playMusic(musicFile, nowM);
        				break;
                    	                   	
                    	
                    	System.out.println(" 파일을 재생합니다."+ firstM +"번째 파일");
                    case 2:
                    	System.out.println("라디오를 켭니다.");
                    case 3:
                    	System.out.println("사진파일을 켭니다.");
                    }
                    break;
                case 4:
                    System.out.println("주유소");
                    System.out.println("원하시는 주유 방법을 선택해주세요. (휘발유:1, LPG:2, 전기:3)");
                    int gas = input.nextInt(); // 주유 방법 선택
                    switch (gas) {
                        case 1:
                            System.out.println("휘발유 주유가 가까운 주유소로 안내합니다.");
                            break;
                        case 2:
                            System.out.println("LPG 주유가 가까운 주유소로 안내합니다.");
                            break;
                        case 3:
                            System.out.println("전기 자동차 주유소로 안내합니다.");
                            break;
                        default:
                            System.out.println("잘못된 입력입니다.");
                            break;
                    }//switch
                    break;
                default:
                    System.out.println("잘못된 입력입니다.");
                    break;
            }//switch
        }//while

        input.close(); // Scanner 객체 닫기
    }

	private static void play() {
		// TODO Auto-generated method stub
		
	}//main
	
	private static CarValue playMusic () {
    	
    	for (int nowM= 0; nowM <= nowM; nowM++) {
    		if (nowM[i] < musicFile[])
    		nowM =1+ ++nowM;
    		playMusic = play();
    		break;
    	}
    	}
    	return playMusic;
    	
}//class