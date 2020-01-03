/**
 * 
 */
package org.tinghu.demo;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @ClassName: SocketDemo
 * @Description:TODO
 * @author: Administrator
 * @date: 2019年5月16日 下午4:26:34
 * 
 */
public class ServerSocketDemo {

	/**
	 * 
	 */
	public ServerSocketDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// 监听指定的端口
		int port = 55533;
		try {
			ServerSocket server = new ServerSocket(port);

			// server将一直等待连接的到来
			System.out.println("server将一直等待连接的到来");
			Socket socket = server.accept();
			// 建立好连接后，从socket中获取输入流，并建立缓冲区进行读取
			InputStream inputStream = socket.getInputStream();
			byte[] bytes = new byte[1024];
			int len;
			StringBuilder sb = new StringBuilder();
			while ((len = inputStream.read(bytes)) != -1) {
				// 注意指定编码格式，发送方和接收方一定要统一，建议使用UTF-8
				sb.append(new String(bytes, 0, len, "UTF-8"));
			}
			
			/*byte[] by = new byte[1024];
			int len;
			while ((len = fis.read(by)) != -1) {
				os.write(by, 0, len);
			}*/
			System.out.println("get message from client: " + sb);
			inputStream.close();
			socket.close();
			server.close();
		} catch (Exception e) {
			
		}

	}
}
