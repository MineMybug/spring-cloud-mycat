/**   
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2017</p>    
* @date 2018年8月30日  
* @version 1.0  
*/ 
package rh.springcloud.mycat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import rh.springcloud.mycat.feignClient.SpringDemoServiceFeign;

/**   
* <p>Description: </p>  
* @author ruanhang  
* @date 2018年8月30日  
*/
@RestController
@RequestMapping("feignApi")
public class SpringDemoFeignModulController {

	@Autowired
	private SpringDemoServiceFeign feign;
	
	@RequestMapping(value = "hello", method = RequestMethod.GET)
	public String port(){
		return feign.hello();
	}
}
