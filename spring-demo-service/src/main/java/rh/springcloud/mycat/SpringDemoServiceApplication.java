/**   
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2017</p>    
* @date 2018年8月17日  
* @version 1.0  
*/ 
package rh.springcloud.mycat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**   
* <p>Description: </p>  
* @author ruanhang  
* @date 2018年8月17日  
*/
@SpringBootApplication
@EnableEurekaClient
public class SpringDemoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDemoServiceApplication.class, args);
	}
}
