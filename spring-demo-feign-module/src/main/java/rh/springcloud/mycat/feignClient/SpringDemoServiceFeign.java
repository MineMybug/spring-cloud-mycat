/**   
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2017</p>    
* @date 2018年8月30日  
* @version 1.0  
*/ 
package rh.springcloud.mycat.feignClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**   
* <p>Description: </p>  
* @author ruanhang  
* @date 2018年8月30日  
*/
@FeignClient(value = "spring-demo-service",fallback = ErrorHystrix.class)
public interface SpringDemoServiceFeign {

	@RequestMapping(value = "port", method = RequestMethod.GET)
	String hello();
}
