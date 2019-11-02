/*
데이터베이스에 접근하기 위한 메서드를 정의한 클래스
추상메서드를 override하여 사용하며, 메서드를 통해 data패키지에 접근한다.
*/
package dao;

import java.util.ArrayList;
import java.util.HashMap;

import data.Database;
import vo.UserVO;

public class UserDaoImpl implements UserDao {
	
	private static UserDaoImpl instance;
	
	private UserDaoImpl(){
		
	}
	
	public static UserDaoImpl getInstance(){
		if(instance == null)
		{
			instance = new UserDaoImpl();
		}
		return instance;
	}
	
	Database database = Database.getInstance();

	@Override
	public UserVO selectUser(String key, String value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserVO selectUser(HashMap<String, String> param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertUser(UserVO user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<UserVO> selectUserList() {
		// TODO Auto-generated method stub
		return null;
	}

}
