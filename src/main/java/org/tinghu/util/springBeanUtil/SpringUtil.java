/**
 * 
 */
package org.tinghu.util.springBeanUtil;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @ClassName: SpringUtil
 * @Description:普通类调用Spring bean对象
 * @author: WBSHXZ_HUTING
 * @date: 2019年1月24日 上午11:33:44
 * 
 */
public class SpringUtil implements ApplicationContextAware {

	public SpringUtil() {
		// TODO Auto-generated constructor stub
	}

	private static ApplicationContext applicationContext = null;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.springframework.context.ApplicationContextAware#setApplicationContext
	 * (org.springframework.context.ApplicationContext)
	 */
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		if (SpringUtil.applicationContext == null) {
			SpringUtil.applicationContext = applicationContext;
		}
		System.out.println(
				"---------------org.tinghu.util.springBeanUtil---------------");
		System.out.println(
				"========ApplicationContext配置成功,在普通类可以通过调用SpringUtils.getAppContext()获取applicationContext对象,applicationContext="
						+ SpringUtil.applicationContext + "========");
		System.out.println("-----------------------------------------------");
	}

	// 该方法用于外界获取ApplicationContext对象
	public static ApplicationContext getApplicationContext() {
		return applicationContext;
	}

	// 该方法用于外界通过bean的名字获取Bean对象
	public static Object getBean(String name) {
		return getApplicationContext().getBean(name);
	}

	// 通过class获取Bean.
	public static <T> T getBean(Class<T> clazz) {
		return getApplicationContext().getBean(clazz);
	}

	// 通过name,以及Clazz返回指定的Bean
	public static <T> T getBean(String name, Class<T> clazz) {
		return getApplicationContext().getBean(name, clazz);
	}
}
