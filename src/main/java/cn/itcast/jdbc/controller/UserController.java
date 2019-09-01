package cn.itcast.jdbc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.itcast.jdbc.service.UserService;
/**
* @Description: springboot与jdbc整合
* @author zl  
* @date 2019年6月1日  
* @version V1.0
 */
@RestController
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/saveUser")
	public String saveUser(String username,String password,String sex) {
		userService.saveUser(username, password, sex);
		return "success";
	}

}
