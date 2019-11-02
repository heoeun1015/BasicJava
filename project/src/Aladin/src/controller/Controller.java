/*
controller 패키지에는 콘솔창을 실행할 MainPrint클래스와
제어를 담당하는 Controller클래스가 있다.
*/
/*
s : Scanner를 사용하기위한 변수
*/
package controller;

import java.util.Scanner;

import service.UserService;
import service.UserServiceImpl;

public class Controller {
	
	static UserService userService = UserServiceImpl.getInstance();			//static이 없으면 Controller클래스에서 오류
	
	static void start()		//static protected로 설정하여 상속받은 클래스인 MainPrint클래스에서 접근할 수 있도록 설정한다.
	{									//MainPrint클래스에서 start메서드가 호출된다.
		Scanner s = new Scanner(System.in);	//스캐너를 이용해 질문에 대한 답을 변수에 저장한다.
		
		int menu;						//스캐너로 받은 숫자를 저장할 변수(int형)
		
		do
		{
			System.out.println("알라딘 온라인 중고서점");						//footer입력
			System.out.println("대전광역시 중구 중앙로 76 영민빌딩 2층");
			System.out.println("대표전화: 042-222-8202 팩스: 042-252-0678");
			System.out.println("5조 - 한승희, 이정은, 박재욱, 최효은, 진주호");
			System.out.println("==================================================");
			System.out.println("1.로그인 / 2.회원가입 / 3.고객센터 / -1.종료");
			System.out.println("==================================================");
			System.out.println("메뉴에 해당하는 번호 입력>");							//문구 수정필요.
			menu = Integer.parseInt(s.nextLine());	//문자열로 입력받아 int형으로 변환할것. 스캐너에 .nextInt()가 있지만 버그가 있음.
			
			switch(menu)			//수정필요.
			{
			case 1://로그인
				userService.login();
				break;
			case 2://회원가입
				userService.join();
				break;
			case 3:
				//고객센터
				break;
			case 4://회원리스트 출력 <= 회원 관리로 대체하고 회원 관리 목록에서 회원 리스트 출력 넣을것.
				userService.userList();
				break;
			case -1://프로그램 종료
				System.out.println("프로그램 종료");
			default:
				break;
			}
		}
		while(menu != -1);
	}
}
