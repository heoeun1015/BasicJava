/*
로그인 및 회원가입 등의 기능을 정의한 클래스이다.
*/
package service;

import dao.UserDao;
import dao.UserDaoImpl;

public class UserServiceImpl implements UserService{

	private static UserServiceImpl instance;
	
	private UserServiceImpl(){
		
	}
	
	public static UserServiceImpl getInstance(){
		if(instance == null)
		{
			instance = new UserServiceImpl();
		}
		return instance;
	}
	
	UserDao userDao = UserDaoImpl.getInstance();
	
	@Override
	public void join() {
		//회원가입을 할 수 있는 메서드
		//데이터베이스의 회원정보에 접근하여 id와 email을 입력한 id와 email을 비교하여 중복된
		//데이터가 있으면 회원가입 불가. 중복된 데이터가 없을 경우 회원 정보를 데이터베이스에 등록.
		//(정규식 패턴도 추가하여 패턴에 맞게 작성되지 않았다면 회원가입 반려)
		//회원가입에 필요한 정보는 이름, 비밀번호(비밀번호 확인도 넣어서 제대로 입력하였는지 확인),
		//email, 주소, 광고성 메세지 수신 여부 확인.
	}

	@Override
	public void login() {
		//로그인을 할 수 있는 메서드
		//입력한 id와 데이터베이스의 id를 비교 후 일치하는 id가 있으면, 데이터베이스의
		//회원정보에서 password와 입력한 password를 비교할 것.
		//일치하면 로그인이 성공했다는 메세지를 띄운 후 기능으로 넘어감.
	}

	@Override
	public void userList() {
		//회원 전체 목록을 출력하는 메서드. 단, 관리자만 열람할 수 있도록 제한한다.
		//회원고유번호(가입한 순서, 0번은 관리자), 아이디, 비밀번호, 이름, email, 주소, 광고성 메세지 수신 여부를 표시
	}

	@Override
	public void userInfo() {	//나중에 시간남으면 할것.
		//개인 회원 정보 열람//관리자권한
		//개인 회원 열람시 열람한 목록(log파일)을 열람할 수 있도록 메서드 구성
	}
	

}
