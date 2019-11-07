package controller;

import java.util.Scanner;

import data.Session;
import service.BookFindSearchService;
import service.BookFindSearchServiceImpl;
import service.FAQService;
import service.FAQServiceImpl;
import service.NoticeService;
import service.NoticeServiceImpl;
import service.QNAService;
import service.QNAServiceImpl;
import service.RecentListService;
import service.RecentListServiceImpl;
import service.RecentService;
import service.RecentServiceImpl;
import service.ReviewService;
import service.ReviewServiceImpl;
import service.SPListService;
import service.SPListServiceImpl;
import service.SellRegisterService;
import service.SellRegisterServiceImpl;
import service.UserService;
import service.UserServiceImpl;

public class GuestController {
    BookFindSearchService bfs = BookFindSearchServiceImpl.getInstance(); // 도서를 카테고리로 검색 + 키워드로 검색
    NoticeService ns = NoticeServiceImpl.getInstance(); // 공지사항 
    FAQService faq = FAQServiceImpl.getInstance(); // FAQ
    QNAService qna = QNAServiceImpl.getInstance(); // QNA
    SPListService spsv = SPListServiceImpl.getInstance(); // 장바구니
    RecentListService rlsv = RecentListServiceImpl.getInstance(); // 구매 리스트
    RecentService rtsv = RecentServiceImpl.getInstance(); // 구매 유저
    ReviewService rs = ReviewServiceImpl.getInstance(); // 리뷰
    SellRegisterService srsv = SellRegisterServiceImpl.getInstance(); // 판매등록
    UserService usv = UserServiceImpl.getInstance();
    
	//1.구매 - 도서조회, 검색//책 정보 열람, 장바구니에 넣기, 리뷰
			//2.판매등록
			//3.고객센터 - 공지사항 열람, FAQ 열람, QNA질문글 작성
			//4.MyPage - 구매이력, 장바구니, 회원정보수정
			//0.로그아웃
	//1.구매
	//1.도서조회 2.검색 0.이전화면
	
	//1.도서조회
		//1. 2. 3. 4. 5.
		//선택하면 해당 카테고리 출력
		//책 선택 후 //책 정보열람, 장바구니에 넣기, 리뷰 목록 선택화면 출력
	
	//2.검색
		//검색내용과 일치하는 책리스트를 출력
		//책 선택 후 //책 정보열람, 장바구니에 넣기, 리뷰 목록 선택화면 출력
	
		//리뷰 전체 출력
		//내용 볼 수 있도록 처리
	
	//2.판매등록
		//5개의 카테고리를 출력 후 유저에게 어떤 종류의 책인지 답변받을것.
		//책 제목 답변받기
		//책 저자 답변받기
		//출판사 답변받기
		//몇권을 팔것인지
		//희망 가격 답변받기
		//책 번호 BookDao에서 리스트 개수 반환받아 책번호에 넣을것. 
	
	public void userMenu(){
		Scanner s = new Scanner(System.in);
		
		try{
			int userMenu;

			while(true){
				System.out.println();
				System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒[유저메뉴]▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
				System.out.println();
				System.out.println("\t 1.도서 검색 후 구매");
				System.out.println("\t 2.도서 판매등록");
				System.out.println("\t 3.고객센터");
				System.out.println("\t 4.마이페이지");
				System.out.println();
				System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
				System.out.println();
				System.out.print("메뉴에 해당하는 번호 입력>");
				
				userMenu = Integer.parseInt(s.nextLine());
				
				switch(userMenu){
					case 1: //도서 구매
						BookBuy();
						break;
					case 2: //도서 판매등록
						SellRegisterService();
						break;
					case 3: //고객센터
						Center();
						break;
					case 4: //마이페이지
						MyPage();
						break;
					
					case 0: 
						System.out.println("이전화면으로 돌아갑니다.");
						System.exit(0); //이전화면으로 / 메인 메소드 불러와야함
				}
				if(userMenu > 5){
					System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
					System.out.println();
				}
			}
		}catch(NumberFormatException ne){
			System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
			userMenu();
			System.out.println();
		}
		
		s.close();
	}
	
	
	void BookBuy(){
		Scanner s = new Scanner(System.in);
		
		try{
			int BookBuy;

			while(true){
				System.out.println();
				System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒[도서 구매]▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
				System.out.println();
				System.out.println("\t 1.도서 카테고리 검색 후 구매");
				System.out.println("\t 2.도서 키워드 검색 후 구매");
				System.out.println("\t 0.뒤로 가기");
				System.out.println();
				System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
				System.out.println();
				System.out.print("메뉴에 해당하는 번호 입력>");
				
				BookBuy = Integer.parseInt(s.nextLine());
				
				switch(BookBuy){
					case 1: //도서 카테고리 검색 후 구매
						bfs.bookFind();
						break;
					case 2: //도서 키워드 검색 후 구매
						bfs.search();
						break;
					
					case 0: 
						System.out.println("이전화면으로 돌아갑니다.");
						BookBuy(); //책 구매 화면으로 
				}
				if(BookBuy > 3){
					System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
					System.out.println();
				}
			}
		}catch(NumberFormatException ne){
			System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
			BookBuy();
			System.out.println();
		}
		s.close();
	}
	
	//2.판매등록
			//5개의 카테고리를 출력 후 유저에게 어떤 종류의 책인지 답변받을것.
			//책 제목 답변받기
			//책 저자 답변받기
			//출판사 답변받기
			//몇권을 팔것인지
			//희망 가격 답변받기
	
	void SellRegisterService(){
		Scanner s = new Scanner(System.in);
		
		try{
			int SellRegisterService;

			while(true){
				System.out.println();
				System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒[유저메뉴]▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
				System.out.println();
				System.out.println("\t 1.도서 판매");
				System.out.println("\t 0.뒤로 가기");
				System.out.println();
				System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
				System.out.println();
				System.out.print("메뉴에 해당하는 번호 입력>");
				
				SellRegisterService = Integer.parseInt(s.nextLine());
				
				switch(SellRegisterService){
					case 1: //도서 판매 등록
						srsv.answer();
						break;
					
					case 0: 
						System.out.println("이전화면으로 돌아갑니다.");
						userMenu(); //이전화면으로
				}
				if(SellRegisterService > 2){
					System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
					System.out.println();
				}
			}
		}catch(NumberFormatException ne){
			System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
			SellRegisterService();
			System.out.println();
		}
		s.close();
	}
	//3.고객센터
	//1.공지사항 제목 출력
		//번호 선택하면 내용 출력
	//2.FAQ 제목 출력
		//번호 선택하면 내용 출력
	//3.QNA 제목 출력
		//번호 선택하면 내용 열람
		//글쓰기 기능
	
	void Center(){ 
		Scanner s = new Scanner(System.in);
		
		try{
			int Center;

			while(true){
				System.out.println();
				System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒[유저메뉴]▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
				System.out.println();
				System.out.println("\t 1.공지사항 보기");
				System.out.println("\t 2.FAQ 보기");
				System.out.println("\t 3.QNA 보기");
				System.out.println("\t 0.뒤로 가기");
				System.out.println();
				System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
				System.out.println();
				System.out.print("메뉴에 해당하는 번호 입력>");
				
				Center = Integer.parseInt(s.nextLine());
				
				switch(Center){
					case 1: //공지사항 선택
						NoticeCenter();
						break;
					case 2: //FAQ 선택
						FAQCenter();
						break;
					case 3: //QNA보기
						QNACenter();
						break;
					
					case 0: 
						System.out.println("이전화면으로 돌아갑니다.");
						userMenu(); //이전화면으로
				}
				if(Center > 4){
					System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
					System.out.println();
				}
			}
		}catch(NumberFormatException ne){
			System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
			Center();
			System.out.println();
		}
		s.close();
	}
	
	//공지사항 선택 메소드
	void NoticeCenter(){ 
		Scanner s = new Scanner(System.in);
		
		try{
			int NoticeCenter;

			while(true){
				System.out.println();
				System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒[유저메뉴]▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
				System.out.println();
				System.out.println("\t 1.전체 공지사항 보기");
				System.out.println("\t 2.공지사항 선택");
				System.out.println("\t 0.뒤로 가기");
				System.out.println();
				System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
				System.out.println();
				System.out.print("메뉴에 해당하는 번호 입력>");
				
				NoticeCenter = Integer.parseInt(s.nextLine());
				
				switch(NoticeCenter){
					case 1: //공지사항 보기
						ns.noticeList();
						break;
					case 2: //fAQ 보기
						ns.noticeContent();
						break;
					
					case 0: 
						System.out.println("이전화면으로 돌아갑니다.");
						Center(); //고객센터로
				}
				if(NoticeCenter > 3){
					System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
					System.out.println();
				}
			}
		}catch(NumberFormatException ne){
			System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
			NoticeCenter();
			System.out.println();
		}
		s.close();
	}
	
	// FAQ 선택 메소드
	void FAQCenter(){ 
		Scanner s = new Scanner(System.in);
		
		try{
			int FAQCenter;

			while(true){
				System.out.println();
				System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒[유저메뉴]▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
				System.out.println();
				System.out.println("\t 1.전체 FAQ 보기");
				System.out.println("\t 2.FAQ 선택");
				System.out.println("\t 0.뒤로 가기");
				System.out.println();
				System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
				System.out.println();
				System.out.print("메뉴에 해당하는 번호 입력>");
				
				FAQCenter = Integer.parseInt(s.nextLine());
				
				switch(FAQCenter){
					case 1: //전체 FAQ 보기
						faq.FAQList();
						break;
					case 2: //FAQ 내용보기
						faq.FAQContent();
						break;
					
					case 0: 
						System.out.println("이전화면으로 돌아갑니다.");
						Center(); //고객센터로
				}
				if(FAQCenter > 3){
					System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
					System.out.println();
				}
			}
		}catch(NumberFormatException ne){
			System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
			FAQCenter();
			System.out.println();
		}
		s.close();
	}
	//QNA 목록 출력 및 선택 
	void QNACenter(){ 
		Scanner s = new Scanner(System.in);
		
		try{
			int QNACenter;

			while(true){
				System.out.println();
				System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒[유저메뉴]▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
				System.out.println();
				System.out.println("\t 1.전체 QNA 보기");
				System.out.println("\t 2.QNA 선택");
				System.out.println("\t 3.QNA 작성");
				System.out.println("\t 0.뒤로 가기");
				System.out.println();
				System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
				System.out.println();
				System.out.print("메뉴에 해당하는 번호 입력>");
				
				QNACenter = Integer.parseInt(s.nextLine());
				
				switch(QNACenter){
					case 1: //전체 QNA 보기
						qna.QNAList();
						break;
					case 2: //QNA 내용보기
						qna.QNAContent();
						break;
					// QNA 직접 입력하는 메소드 필요
					case 0: 
						System.out.println("이전화면으로 돌아갑니다.");
						Center(); //고객센터로
				}
				if(QNACenter > 3){
					System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
					System.out.println();
				}
			}
		}catch(NumberFormatException ne){
			System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
			QNACenter();
			System.out.println();
		}
		s.close();
	}
	
	//4.MyPage
		//1.구매이력
			//제목이 출력된 후 번호를 선택하면 구매이력 리스트가 출력됨
		//2.장바구니
			//1.선택 2.전부선택 3.선택취소 4.전부선택취소 5.삭제 6.구매
		//3.회원정보 수정 -- 메소드 구현해야함
			//비밀번호를 먼저 받아 인증
			//1.비밀번호 수정 2.주소 수정 3.전화번호 수정 4.이메일 수정
	
	void MyPage(){
		Scanner s = new Scanner(System.in);
		
		try{
			int MyPage;

			while(true){
				System.out.println();
				System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒[유저메뉴]▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
				System.out.println();
				System.out.println("\t 1.구매이력 보기");
				System.out.println("\t 2.장바구니 보기");
				System.out.println("\t 3.회원정보 수정");
				System.out.println("\t 0.뒤로 가기");
				System.out.println();
				System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
				System.out.println();
				System.out.print("메뉴에 해당하는 번호 입력>");
				
				MyPage = Integer.parseInt(s.nextLine());
				
				switch(MyPage){
					case 1: //구매이력
						BookRegist();
						break;
					case 2: //장바구니
						ViewSp();
						break;
					case 3: //회원정보수정
						MemberModify();
						break;
					
					case 0: 
						System.out.println("프로그램을 종료합니다.");
						MyPage(); //이전화면으로
				}
				if(MyPage > 4){
					System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
					System.out.println();
				}
			}
		}catch(NumberFormatException ne){
			System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
			MyPage();
			System.out.println();
		}
		s.close();
	}
	
	//구매이력 보기
	void BookRegist(){
		Scanner s = new Scanner(System.in);
		
		rlsv.viewRecentList(Session.loginUser.getId());
			
		rlsv.detailViewList();
		
		s.close();
	}
	
	//장바구니 보기
	//1.선택 2.선택해제 3.전체선택 4.전체선택해제 5.구매 6.삭제 7. 장바구니 리스트 출력 0.이전화면
		void ViewSp(){
			Scanner s = new Scanner(System.in);
			
			try{
				int ViewSp;

				while(true){
					System.out.println();
					System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒[유저메뉴]▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
					System.out.println();
					System.out.println("\t 1.목록 선택");
					System.out.println("\t 2.목록 선택 해제");
					System.out.println("\t 3.목록 전체 선택");
					System.out.println("\t 4.목록 전체 선택해제");
					System.out.println("\t 5.선택 목록 구매");
					System.out.println("\t 6.선택 목록 삭제");
					System.out.println("\t 7.장바구니 리스트 출력");
					System.out.println("\t 0.뒤로 가기");
					System.out.println();
					System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
					System.out.println();
					System.out.print("메뉴에 해당하는 번호 입력>");
					
					ViewSp = Integer.parseInt(s.nextLine());
					
					switch(ViewSp){
						case 1: //장바구니 목록 번호 선택
							spsv.select();
							break;
						case 2: //선택취소
							spsv.cancel();
							break;
						case 3: //모두선택
							spsv.allSelect();
							break;
						case 4:	//모두 취소
							spsv.allCancel();
						case 5:
							spsv.buy();
						case 6:
							spsv.delete();
						case 7:
							spsv.viewSPList();						
						case 0: 
							System.out.println("이전화면으로 돌아갑니다.");
							MyPage(); //이전화면으로
					}
					if(ViewSp > 5){
						System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
						System.out.println();
					}
				}
			}catch(NumberFormatException ne){
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
				ViewSp();
				System.out.println();
			}
			s.close();
		}
		
		//회원정보수정
		void MemberModify()
		{
			usv.changeUserInfo();
		}
}
