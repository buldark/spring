package user.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import lombok.Setter;
import user.bean.UserDTO;
import user.dao.UserDAO;

public class UserUpdateService implements UserService {
	@Setter
	private UserDAO userDAO;
	
	
	//db
	@Override
	public void execute() {
		Scanner scan =new Scanner(System.in);
		System.out.println("수정할 id 입력");
		String id = scan.next();
	
		UserDTO userDTO = userDAO.getUser(id);//딱 한명분만 받아오니깐 list가 아니라 DTO로!
		
		if(userDTO ==null) {
			System.out.println("찾고자 하는 아이디가 없습니다");
			return;
		}
		
		System.out.println(userDTO.getName()+"\t"+userDTO.getId()+"\t"+userDTO.getPwd());
		
		System.out.println();
		System.out.println("이름");
		String name =scan.next();
		System.out.println("pwd");
		String pwd = scan.next();
		
		Map<String,String> map = new HashMap<String, String>();
		map.put("name", name);
		map.put("id",id);
		map.put("pwd",pwd);
		
		userDAO.update(map);
		
		System.out.println("db수정");
	}

}
