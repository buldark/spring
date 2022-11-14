package user.dao;

import java.util.List;
import java.util.Map;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import lombok.Setter;
import user.bean.UserDTO;

public class UserDAOImpl extends JdbcDaoSupport implements UserDAO {
	
	
	
	
	@Override
	public void write(UserDTO userDTO) {
		String sql = "insert into usertable values(?,?,?)";
		getJdbcTemplate().update(sql,userDTO.getName(),userDTO.getId(),userDTO.getPwd());//insert라고 만드는게 아니라 update 사용을 통해서 conncec prepere close까지 다 함 
		//update(String sql, Object...) Object...의미는 매개변수의 개수를 자유롭게 사용
		//.update()=> insert/update/delete 3가지 다 함
		
	}


	@Override
	public List<UserDTO> getUserList() {
		String sql="select * from usertable";//한줄당 DTO 클래스와 mapping 시키겠다라는 뜻 :BeanPropertyRowMapper(UserDTO.class)
 		return getJdbcTemplate().query(sql, new BeanPropertyRowMapper<UserDTO>(UserDTO.class));//.queryforobject는 딱 하나 /.query가 여러개 
	}



		/* String sql = "update usertable set name=? , pwd=? where id = ? "; */
	




	@Override
	public UserDTO getUser(String id) {
		String sql="select *from usertable where id = ?";
		try {return getJdbcTemplate().queryForObject(sql,new BeanPropertyRowMapper<UserDTO>(UserDTO.class),id );
		}catch(EmptyResultDataAccessException e) {
			return null;
		}
		
	} 
	@Override
	public void update(Map<String, String> map) {
		String sql = "update usertable set name=? , pwd=? where id = ? ";
		getJdbcTemplate().update(sql,map.get("name"),map.get("pwd"),map.get("id"));
	}


	@Override
	public void getDelete(String id) {
		String sql = "delete  from usertable where id=? ";
		 getJdbcTemplate().update(sql,id);
		
	}
	}





