package org.tinghu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.tinghu.dao.UserRepository;
import org.tinghu.domain.User;

/*
 * @RestController的意思就是controller里面的方法都以json格式输出，不用再写什么jackjson配置的了！
 */

@RestController
@RequestMapping("/User")
public class AccountController {

	@Autowired
	UserRepository userRepository;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public List<User> getUsers() {
		return userRepository.findAll();
	}
	
	 /** The method findOne(Example<S>) in the type QueryByExampleExecutor<User> is not applicable for the arguments (Long)
	 * 
	 * */
	
	@RequestMapping(value = "/id={id}", method = RequestMethod.GET)
	public User getUserById(@PathVariable("id") Long id) {
		User user = new User();
		user.setId(id);
        Example<User> userExample = Example.of(user);
        return userRepository.findOne(userExample).orElse(null); 
		//return userRepository.findOne(id);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public User getUserByIdAndName(@PathVariable("id") Long id, @RequestParam(value = "name", required = true) String name) {
		User user = new User();
		user.setId(id);
		user.setUserName(name);
        Example<User> userExample = Example.of(user);
        return userRepository.findOne(userExample).orElse(null); 
		//return userRepository.findOne(id);
	}

	/*
	 * PUT POST 方式，请求会报错
	 */
	
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public String updateUser(@PathVariable("id") int id, @RequestParam(value = "name", required = true) String name,
			@RequestParam(value = "email", required = true) String email) {
		User User = new User();
		User.setUserName(name);
		User.setEmail(email);
		User User1 = userRepository.saveAndFlush(User);
		return User1.toString();
	}

	@RequestMapping(value = "", method = RequestMethod.POST)
	public String postUser(@RequestParam(value = "name") String name, @RequestParam(value = "email") String email) {
		User User = new User();
		User.setUserName(name);
		User.setEmail(email);
		User User1 = userRepository.save(User);
		return User1.toString();
	}
}