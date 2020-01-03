/**
 * 
 */
package org.tinghu.demo;

/**
 * @ClassName: ThreadRunnableDemo
 * @Description:TODO
 * @author: Administrator
 * @date: 2019年5月15日 下午8:53:18
 * 
 */
public class ThreadRunnableDemo implements Runnable {

	private Thread t;
	private String threadName;

	ThreadRunnableDemo(String name) {
	      threadName = name;
	      System.out.println("Creating " +  threadName );
	   }
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		
		System.out.println("Running " + threadName);
		try {
			for (int i = 0; i < 4; i++) {
				System.out.println("Thread: " + threadName + ", " + i);
				// 让线程睡眠一会
				Thread.sleep(50);
			}
		} catch (InterruptedException e) {
			//线程被打断
			System.out.println("Thread " +  threadName + " interrupted.");
		}
		System.out.println("Thread " +  threadName + " exiting.");
	}
	
	public void start(){
		 System.out.println("Starting " +  threadName );
		 if(t == null){
			 t = new Thread(this, threadName);
			 t.start();
		 }
	}
	
	//无参构造方法
	public ThreadRunnableDemo() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		ThreadRunnableDemo tr = new ThreadRunnableDemo("Thread-1");
		tr.start();
		
		
		ThreadRunnableDemo tr2 = new ThreadRunnableDemo("Thread-2");
		tr2.start();
		
	}
}
