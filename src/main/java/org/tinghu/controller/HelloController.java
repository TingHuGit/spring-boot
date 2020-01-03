/**
 * 
 */
package org.tinghu.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName: HelloController
 * @Description:TODO
 * @author: WBSHXZ_HUTING
 * @date: 2019年2月12日 上午10:46:37
 * 
 */
@Controller
public class HelloController {

	/**
	 * 
	 */
	
	// 从 application.properties 中读取配置，如取不到默认值为Hello Shanhy
	@Value("${application.hello:Hello Angel}")
	private String hello;

	@RequestMapping("/helloJsp")
	public String helloJsp(Map<String, Object> map) {
		System.out.println("HelloController.helloJsp().hello=" + hello);
		map.put("hello", hello);
		return "helloJsp";
	}
}
