package org.tinghu;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
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
public class SpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}
	
	/**
     * 注册Servlet.不需要添加注解：@ServletComponentScan
     * @return
     */

    @Bean
    public ServletRegistrationBean MyServlet1(){

              return new ServletRegistrationBean(new MyServlet2(),"/myServlet2/*");
    }
	
	/*
	 *  打印springboot 自动为项目注入的bean
	 */
	
	/*@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {
			System.out.println("Let's inspect the beans provided by Spring Boot:");
			String[] beanNames = ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			for (String beanName : beanNames) {
				System.out.println(beanName);
			}
		};
	}*/
}
