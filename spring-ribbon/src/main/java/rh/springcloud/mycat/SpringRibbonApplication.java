/**   
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2017</p>    
* @date 2018年8月23日  
* @version 1.0  
*/ 
package rh.springcloud.mycat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

/**   
* <p>Description: </p>  
* @author ruanhang  
* @date 2018年8月23日  
*/
@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
public class SpringRibbonApplication {
	
	public static void main(String[] args) {
		
		SpringApplication.run(SpringRibbonApplication.class, args);
	}

	/**
	 * 
	 * <p>Description:向容器中注入 restTemplate，同时通过 @LoadBalanced 开启 restTemplate 负载均衡功能。 </p>  
	 * @return
	 */
	
	@Bean
	@LoadBalanced
	RestTemplate restTemplate() {
		return new RestTemplate();
	}

	//新增注入随机策略 Bean
	@Bean
	public IRule ribbonRule() {
		return new RandomRule();	//这里配置策略，和配置文件对应
	}

}
