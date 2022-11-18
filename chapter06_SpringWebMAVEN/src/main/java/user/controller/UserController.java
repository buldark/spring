package user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import user.bean.UserDTO;
import user.service.UserServiceImpl;
import user.service.UserService;
@Controller @Component
@RequestMapping(value="user")
public class UserController {
	@Autowired
	private UserService userService;
	
	@GetMapping(value="writeForm")
	public String writeForm() {
		return "user/writeForm";
		}
	@PostMapping(value = "write")
	@ResponseBody// 메소드가 void이기에 + dispatcher로 가지말라는 뜻 dispatcher로 못가게 막음 - String을 문자열로 출력 하는 annotation 안쓰면 .jsp뿥어서 감 
	public void write(@ModelAttribute UserDTO userDTO ) {
		userService.write(userDTO);
		//웹과 상관 없는 애들은 userservice 와 userdao ...이건 또 servlet 따로...
	}
	@GetMapping(value="list")
	public String list() {
		return "user/list";
	}
	
	@PostMapping(value="getUserList")
	@ResponseBody//알아서 json타입으로 바꿔줌
	public List<UserDTO> getUserList(){
		//DB연결가능하지만 비추
		return userService.getUserList();
	}
	@PostMapping(value="isExistId")
	@ResponseBody
	public String isExistId(@RequestParam String id) {
		return userService.isExistId(id);
	}
	@GetMapping(value="updateForm")
	public String updateForm() {
		return "user/updateForm";
		}
	
	@PostMapping(value="getUser")
	@ResponseBody
	public UserDTO getUser(@RequestParam String id) {
		return userService.getUser(id);
	}
	
}




















