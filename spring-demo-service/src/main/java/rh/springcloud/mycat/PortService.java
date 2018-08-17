/**   
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2017</p>    
* @date 2018年8月17日  
* @version 1.0  
*/ 
package rh.springcloud.mycat;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**   
* <p>Description: </p>  
* @author ruanhang  
* @date 2018年8月17日  
*/
@RestController
public class PortService {
	
    @Value("${server.port}")
    String port;

    @RequestMapping("port")
    public String getPort() {
        return "Hello World, I'm from port : " + port;
    }

}
