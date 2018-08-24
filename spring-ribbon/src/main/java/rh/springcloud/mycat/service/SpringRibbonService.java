/**   
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2017</p>    
* @date 2018年8月23日  
* @version 1.0  
*/ 
package rh.springcloud.mycat.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**   
* <p>Description: </p>  
* @author ruanhang  
* @date 2018年8月23日  
*/
@Service
public class SpringRibbonService {

	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	LoadBalancerClient loadBalancerClient;
	
	public String port(){
		this.loadBalancerClient.choose("spring-demo-service");  //随机访问策略
		return restTemplate.getForObject("http://SPRING-DEMO-SERVICE/port",  String.class);
	}
}
