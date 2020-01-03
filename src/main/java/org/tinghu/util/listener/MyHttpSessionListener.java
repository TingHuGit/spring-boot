/**
 * 
 */
package org.tinghu.util.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**   
 * @ClassName:  MyHttpSessionListener   
 * @Description:监听Session的创建与销毁
 * 
 * ServletContex初始化
 *	过滤器初始化
 *	服务启动后，随便访问一个页面，会看到输出：
 *	执行过滤操作
 *	Session 被创建
 * @author: WBSHXZ_HUTING
 * @date:   2019年1月29日 下午3:39:32   
 * 
 */

@WebListener
public class MyHttpSessionListener implements HttpSessionListener {

	/**
	 * 
	 */
	public MyHttpSessionListener() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sessionCreated(HttpSessionEvent se) {
		// TODO Auto-generated method stub
		HttpSessionListener.super.sessionCreated(se);
		System.out.println("Session 被创建");
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		// TODO Auto-generated method stub
		HttpSessionListener.super.sessionDestroyed(se);
		System.out.println("ServletContex初始化");
	}
}
