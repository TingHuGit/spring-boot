/**
 * 
 */
package org.tinghu.util;

/**   
 * @ClassName:  MyWebAppConfigurer   
 * @Description:TODO   
 * @author: WBSHXZ_HUTING
 * @date:   2019年1月22日 上午11:01:35   
 *   
 */
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class MyWebAppConfigurer implements WebMvcConfigurer{
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry  registry) {
	    /**
	     * 配置静态访问资源
	     * @param registry
	     */
		
		registry.addResourceHandler("/myres/**").addResourceLocations("classpath:/myres/");
        
		//指定外部的目录资源
		//registry.addResourceHandler("/my/**").addResourceLocations("file:E:/my/");
		
	}
	
	/*@Override
	public void addInterceptors(){
		
	}*/
	
	//注册拦截器
    /* @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //super.addInterceptors(registry);
        //静态资源；  *.css , *.js
        //SpringBoot已经做好了静态资源映射
        registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("**")
                .excludePathPatterns("/index.html","/","/hello1","/user/login")
                .excludePathPatterns("/static/**");
    }*/
	
	
}