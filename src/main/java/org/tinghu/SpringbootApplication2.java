package org.tinghu;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.tinghu.controller.servlet.MyServlet2;

/* 其中@SpringBootApplication申明让spring boot自动给程序进行必要的配置，
 * 等价于以默认属性使用@Configuration，@EnableAutoConfiguration和@ComponentScan
 * @Configuration  配合@bean  自动导出
 * @EnableAutoConfiguration：启用Spring Boot的自动配置机制，类似在java代码中自动import，属于自动导入。
 * @ComponentScan  扫描所有导入导出的类
 * */
@SpringBootApplication
@ServletComponentScan	//这个就是扫描相应的Servlet包;
public class SpringbootApplication2  extends SpringBootServletInitializer{

	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        // 设置启动类,用于独立tomcat运行的入口
        return builder.sources(SpringbootApplication2.class);
    }
	
	/**
     * 注册Servlet.不需要添加注解：@ServletComponentScan
     * @return
     */

    @Bean
    public ServletRegistrationBean MyServlet1(){

              return new ServletRegistrationBean(new MyServlet2(),"/myServlet2/*");
    }
}
