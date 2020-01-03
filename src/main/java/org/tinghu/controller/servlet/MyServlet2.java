/**
 * 
 */
package org.tinghu.controller.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName: myServlet2
 * @Description: 代码注册 servlet
 * 		需要在启动类里通过ServletRegistrationBean 注册Servlet.
 * 		详见SpringbootApplication.java
 * @author: WBSHXZ_HUTING
 * @date: 2019年1月25日 上午9:44:39
 * 
 */
//@WebServlet(urlPatterns="/myServlet2/*", description="Servlet的说明")
public class MyServlet2 extends HttpServlet {

	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public MyServlet2() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println(">>>>>>>>>>doGet()<<<<<<<<<<<");
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println(">>>>>>>>>>doPost()<<<<<<<<<<<");
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Hello World</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>这是：myServlet2</h1>");
		out.println("</body>");
		out.println("</html>");
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(req, res);
	}

}
