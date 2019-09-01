package cn.itcast.jdbc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void saveUser(String username,String password,String sex) {
		String sql="insert into user(username,sex,password) values(?,?,?)";
		jdbcTemplate.update(sql, username,sex,password);
	}

}
