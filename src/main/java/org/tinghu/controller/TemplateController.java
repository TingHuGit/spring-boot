/**
 * 
 */
package org.tinghu.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**   
 * @ClassName:  TemplateController   
 * @Description: 模板测试.  thymeleaf
 * thymeleaf和freemarker是可以共存的
 * @author: WBSHXZ_HUTING
 * @date:   2019年1月24日 上午11:50:55   
 *   
 */

@Controller
@RequestMapping("template")
public class TemplateController {

	/**
	 * 
	 */
	public TemplateController() {
		// TODO Auto-generated constructor stub
	}
	
	@RequestMapping("/helloHtml")
	public String helloHtml(Map<String, Object> map){
		
		map.put("hello", "from TemplateController.helloHtml");
		
		return "/helloHtml";
	}
}
