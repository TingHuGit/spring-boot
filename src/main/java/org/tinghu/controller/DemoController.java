package org.tinghu.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tinghu.domain.Demo;
import org.tinghu.domain.User;
import org.tinghu.service.DemoService;

/*
 * @RestController的意思就是controller里面的方法都以json格式输出，不用再写什么jackjson配置的了！
 */

@RestController
@RequestMapping("/demo")
public class DemoController {

	/**
	 * 
	 * @Title: zeroException   
	 * @Description: 异常   
	 * @return int          
	 * @throws
	 */
	@RequestMapping("/zeroException")
	public int zeroException() {
		return 100/0;
	}
	
	@Autowired
    private DemoService demoService;
	
	/**
     * 测试保存数据方法.
     * @return
     */

    @RequestMapping("/save")
    public String save(){
       Demo d = new Demo();
       d.setName("Angel");
       demoService.save(d);//保存数据.
       return"ok.Demo2Controller.save";
    }

    //地址：http://127.0.0.1:8080/demo2/getById?id=1

    @RequestMapping("/getById")
    public Demo getById(long id){
       return demoService.getById(id);

    }
	
}