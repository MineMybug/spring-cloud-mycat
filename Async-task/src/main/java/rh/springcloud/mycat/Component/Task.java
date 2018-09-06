/**   
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2017</p>    
* @date 2018年8月30日  
* @version 1.0  
*/ 
package rh.springcloud.mycat.Component;

import java.util.Random;
import java.util.concurrent.Future;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

/**   
* <p>Description: </p>  
* @author ruanhang  
* @date 2018年8月30日  
*/
@Component
public class Task {
	
	private static final Logger log = LoggerFactory.getLogger(Task.class);
	
    public static Random random =new Random();
	
    @Async
	public Future<String> taskOne() throws Exception {
		System.out.println("开始执行任务一");
		long start=System.currentTimeMillis();
		Thread.sleep(random.nextInt(10000));
		long end=System.currentTimeMillis();
		System.out.println(Thread.currentThread().getName()+"任务一执行时间："+(end- start));
		return new AsyncResult<>("任务一完成");
	}
	
    @Async
	public Future<String> taskTwo() throws Exception {
		System.out.println("开始执行任务二");
		long start=System.currentTimeMillis();
		Thread.sleep(random.nextInt(10000));
		long end=System.currentTimeMillis();
		System.out.println(Thread.currentThread().getName()+"任务二执行时间："+(end- start));
		return new AsyncResult<>("任务二完成");
	}
 
    @Async
	public Future<String> taskThree() throws Exception {
		System.out.println("开始执行任务三");
		long start=System.currentTimeMillis();
		Thread.sleep(random.nextInt(10000));
		long end=System.currentTimeMillis();
		System.out.println(Thread.currentThread().getName()+"任务三执行时间："+(end- start));
		return new AsyncResult<>("任务三完成");
	}

    /**
     * <p>Description: 最简单的异步调用，返回值为void</p>
     */
    @Async
    public void asyncInvokeSimple(){
    	log.info("asyncInvokeSimple");
    }
    
    /**
     * <p>Description: 带参数的异步调用 异步方法传入参数</p>  
     * @param s
     */
    @Async
    public void asyncInvokeWithParameter(String s){
    	log.info("asyncInvokeWithParameter,parameter={}",s);
    }
    
    /**
     * <p>Description:异步调用，返回Future </p>  
     * @param i
     * @return
     */
    @Async
    public Future<String> asyncInvokeReternFuture(int i){
    	log.info("asyncInvokeReternFuture, parameter={}",i);
    	Future<String> future;
    	try {
			Thread.sleep(1000);
			future = new AsyncResult<String>("success " + i);
			
		} catch (Exception e) {
			future = new AsyncResult<String>("erro");
		}
    	return future;
    }

}
