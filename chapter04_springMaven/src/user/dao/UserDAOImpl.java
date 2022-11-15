package user.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import lombok.Setter;
import user.bean.UserDTO;
@Repository//component 라고 써도 되는데 DB연동 여부 알려주는 Bean생성 annotation
/*public class UserDAOImpl extends JdbcDaoSupport implements UserDAO {*/
	public class UserDAOImpl extends NamedParameterJdbcDaoSupport implements UserDAO {
	@Autowired //자동으로 세터 연결 되게 만약 autowired 쓰기 싫으면 생성자로...해야 함 
	public void setDS(DataSource dataSource) {
		setDataSource(dataSource);
	}
	
	@Override
	public void write(UserDTO userDTO) {
	//	String sql = "insert into usertable values(?,?,?)";
	//	getJdbcTemplate().update(sql,userDTO.getName(),userDTO.getId(),userDTO.getPwd());//insert라고 만드는게 아니라 update 사용을 통해서 conncec prepere close까지 다 함 
		
		String sql = "insert into usertable values(:name,:id,:pwd)";
		
		Map<String ,String> map = new HashMap<String, String>();
		map.put("name", userDTO.getName());
		map.put("id", userDTO.getId());
		map.put("pwd", userDTO.getPwd());
		
		getNamedParameterJdbcTemplate().update(sql, map);
		
	}


	@Override
	public List<UserDTO> getUserList() {
		String sql="select * from usertable";//한줄당 DTO 클래스와 mapping 시키겠다라는 뜻 :BeanPropertyRowMapper(UserDTO.class)
 		return getJdbcTemplate().query(sql, new BeanPropertyRowMapper<UserDTO>(UserDTO.class));//.queryforobject는 딱 하나 /.query가 여러개 
	}



		/* String sql = "update usertable set name=? , pwd=? where id = ? "; */
	




	@Override
	public UserDTO getUser(String id) {
		String sql="select *from usertable where id = :id";
		try {return getJdbcTemplate().queryForObject(sql,new BeanPropertyRowMapper<UserDTO>(UserDTO.class),id );
		}catch(EmptyResultDataAccessException e) {
			return null;
		}
		
	} 
	@Override
	public void update(Map<String, String> map) {
		String sql = "update usertable set name=:name , pwd=:pwd where id = :id ";
		//getJdbcTemplate().update(sql,map.get("name"),map.get("pwd"),map.get("id"));
		getNamedParameterJdbcTemplate().update(sql, map);
	}


	@Override
	public void getDelete(String id) {
		String sql = "delete  from usertable where id=?";
		 getJdbcTemplate().update(sql,id);
		
	}
	}





