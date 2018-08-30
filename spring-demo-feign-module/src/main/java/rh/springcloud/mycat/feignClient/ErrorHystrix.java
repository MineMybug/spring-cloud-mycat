/**   
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2017</p>    
* @date 2018年8月30日  
* @version 1.0  
*/ 
package rh.springcloud.mycat.feignClient;

import org.springframework.stereotype.Component;

/**   
* <p>Description: </p>  
* @author ruanhang  
* @date 2018年8月30日  
*/
@Component
public class ErrorHystrix implements SpringDemoServiceFeign{

	@Override
	public String hello() {
		return "sorry, it's error!";
	}

}
