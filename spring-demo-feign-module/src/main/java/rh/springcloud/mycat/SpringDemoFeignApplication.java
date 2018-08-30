/**   
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2017</p>    
* @date 2018年8月30日  
* @version 1.0  
*/ 
package rh.springcloud.mycat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**   
* <p>Description: </p>  
* @author ruanhang  
* @date 2018年8月30日  
*/
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class SpringDemoFeignApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringDemoFeignApplication.class, args);
	}

}
