package org.tinghu.util.listener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * 
 */

/**   
 * @ClassName:  MyServletContextListener   
 * @Description:使用@WebListener注解，实现ServletContextListener接口
 * @author: WBSHXZ_HUTING
 * @date:   2019年1月29日 下午2:58:29   
 *   
 */
@WebListener
public class MyServletContextListener implements ServletContextListener {

	/**
	 * 
	 */
	
	public MyServletContextListener() {
		// TODO Auto-generated constructor stub
	}
	
	 @Override
     public void contextDestroyed(ServletContextEvent arg0) {
               System.out.println("ServletContex销毁");
     }

     @Override
     public void contextInitialized(ServletContextEvent arg0) {
                System.out.println("ServletContex初始化");
     }
}
