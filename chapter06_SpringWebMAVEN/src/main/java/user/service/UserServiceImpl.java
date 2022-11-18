package user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import user.bean.UserDTO;
import user.dao.UserDAO;

@Service
public class UserServiceImpl implements UserService {
	@Override
	public UserDTO getUser(String id) {
		// TODO Auto-generated method stub
		return userDAO.getUser(id);
	}

	@Override
	public String isExistId(String id) {
		//db
		UserDTO userDTO = userDAO.getUser(id);
		
		if(userDTO==null)
			return "non_exist";
		else {
			return "exist";
		}
	}

	@Autowired
	private UserDAO userDAO;
	@Override
	public void write(UserDTO userDTO) {
		userDAO.write(userDTO);	
	}

	@Override
	public List<UserDTO> getUserList() {
	//유
		return userDAO.getUserList();
	}
}
