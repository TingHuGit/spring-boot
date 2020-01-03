package org.tinghu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tinghu.domain.User;

/*
 * @RestController的意思就是controller里面的方法都以json格式输出，不用再写什么jackjson配置的了！
 */

@RestController
public class HelloWorldController {
    
	/**
	 * 
	 * @Title: index
	 * @Description: TODO
	 * @param:
	 * @return: String
	 * @throws
	 */
	@RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }
    
    @RequestMapping("/getUser")
    public User getUser() {
    	User user=new User();
    	user.setUserName("小明");
    	user.setPassWord("xxxx");
        return user;
    }
}