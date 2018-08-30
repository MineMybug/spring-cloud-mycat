/**   
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2017</p>    
* @date 2018年8月30日  
* @version 1.0  
*/ 
package rh.springcloud.mycat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

/**   
* <p>Description: </p>  
* @author ruanhang  
* @date 2018年8月30日  
*/
@SpringBootApplication
@EnableEurekaClient
public class GatewayApplication {
	
	
   /**
    * spring cloud gateway 配置方式之一，启动主程序配置，还有一种是配置文件配置
    * @param builder
    * @return
    */
   @Bean
   public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
      return builder.routes()
            .route(r -> r.path("/qq/**")
                     .and()
                     .uri("http://www.qq.com/"))
            .build();
    }

	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}

}
