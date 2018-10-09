/**   
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2017</p>    
* @date 2018年8月30日  
* @version 1.0  
*/ 
package rh.springcloud.mycat.test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import rh.springcloud.mycat.component.Task;

/**   
* <p>Description: </p>  
* @author ruanhang  
* @date 2018年8月30日  
*/
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootAsyncApplicationTests {
	
	private static final Logger log = LoggerFactory.getLogger(SpringbootAsyncApplicationTests.class);
	
	@Autowired
	private Task task;
	@Test
	public void test() throws Exception {
		
		long start = System.currentTimeMillis();
		
		Future<String> task1 = task.taskOne();
		Future<String> task2 = task.taskTwo();
		Future<String> task3 = task.taskThree();
 
		while(true) {
			if(task1.isDone() && task2.isDone() && task3.isDone()) {
				// 三个任务都调用完成，退出循环等待
				break;
			}
			Thread.sleep(1000);
		}
		long end = System.currentTimeMillis();
 
		System.out.println("任务全部完成，总耗时：" + (end - start) + "毫秒");
	}
	
	@Test
	public void testAsyncInvokeSimpleTest(){
		task.asyncInvokeSimple();
		task.asyncInvokeWithParameter("hi");
		Future<String> future = task.asyncInvokeReternFuture(100);
		try {
			log.info(future.get());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}


}
