package user.service;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import user.bean.UserDTO;
import user.dao.UserDAO;
@Service //Component대시 하여 일을 하는 것을 알려주는 bean 생성 annotaion
public class UserInsertService implements UserService {
	@Autowired
	private UserDAO userDAO;
	@Autowired
	private UserDTO userDTO;
	
	/*
	 * public void setUserDAO(UserDAO userDAO) { this.userDAO = userDAO; } public
	 * void setUserDTO(UserDTO userDTO) { this.userDTO = userDTO; }
	 */
	@Override
	public void execute() {
		//데이터
		
		Scanner scan = new Scanner(System.in);
		System.out.println();
		System.out.print("이름 입력 : ");
		String name = scan.next();
		System.out.print("아이디 입력 : ");
		String id = scan.next();
		System.out.print("비밀번호 입력 : ");
		String pwd = scan.next();

		userDTO.setName(name);
		userDTO.setId(id);
		userDTO.setPwd(pwd);
		
		//DB
		
		userDAO.write(userDTO);
		
		//응답 
		System.out.println(name+"님의 정보를 DB에 저장 하였습니다.");
	}

}
