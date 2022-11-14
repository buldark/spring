package user.service;

import java.util.Scanner;

import lombok.Setter;
import user.bean.UserDTO;
import user.dao.UserDAO;

public class UserDeleteService implements UserService {
	@Setter
	private UserDAO userDAO;
	
	@Override
	public void execute() {
		Scanner scan =new Scanner(System.in);
		System.out.println("삭제할 id 입력");
		String id = scan.next();
		UserDTO userDTO = userDAO.getUser(id);//딱 한명분만 받아오니깐 list가 아니라 DTO로!
		
		if(userDTO ==null) {
			System.out.println("삭제하고자 하는 아이디가 없습니다");
			return;
		}else {

		userDAO.getDelete(id);//id는 pk 그래서 중복이 없어서 이거 하나만 검색해도됨!! 
		
		System.out.println("정보 삭제");}
	}

}
