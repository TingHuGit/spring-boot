/**
 * 
 */
package org.tinghu.util.scheduling;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**   
 * @ClassName:  SchedulingConfig   
 * @Description: 定时任务   // 开启:@EnableScheduling
 * @author: WBSHXZ_HUTING
 * @date:   2019年1月22日 下午3:07:15   
 *   
 */

@Configuration
//@EnableScheduling
public class SchedulingConfig {
	
	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
	private int count=0;
	
	//@Scheduled 参数可以接受两种定时的设置，一种是我们常用的cron="*/5 * * * * ?",
	//一种是 fixedRate = 5000，两种都表示每隔六秒打印一下内容。
	
	//fixedRate 说明
	/*@Scheduled(fixedRate = 5000) ：上一次开始执行时间点之后5秒再执行
	@Scheduled(fixedDelay = 5000) ：上一次执行完毕时间点之后5秒再执行
	@Scheduled(initialDelay=1000, fixedRate=5000) ：第一次延迟1秒后执行，之后按fixedRate的规则每5秒执行一次*/

	 //@Scheduled(fixedRate = 5000)
	 @Scheduled(cron = "0/5 * * * * ?") 	// 每5秒执行一次
	 public void scheduler() {

	   System.out.println(">>>>>>>>> SchedulingConfig.scheduler()");
	   
	   System.out.println("this is scheduler task runing  "+(count++));
	   System.out.println("现在时间：" + dateFormat.format(new Date()));
	   
	   
	}
}
