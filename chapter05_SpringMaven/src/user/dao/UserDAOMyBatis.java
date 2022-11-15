package user.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import lombok.Setter;
import user.bean.UserDTO;

@Repository//이거 하나면 커밋 클로즈 할 필요 없음 이 자체가 aop기능을 하는 것!!
public class UserDAOMyBatis implements UserDAO {
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public void write(UserDTO userDTO) {
		sqlSession.insert("userSQL.write", userDTO);
	}

	@Override
	public List<UserDTO> getUserList() {
		
		return sqlSession.selectList("userSQL.getList");
	}

	@Override
	public UserDTO getUser(String id) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("userSQL.getUser",id);
	}

	@Override
	public void update(Map<String, String> map) {
		// TODO Auto-generated method stub
		sqlSession.update("userSQL.update",map);
	}

	@Override
	public void getDelete(String id) {
		// TODO Auto-generated method stub
		sqlSession.delete("userSQL.delete",id);
	}

}
