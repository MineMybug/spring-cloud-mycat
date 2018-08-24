/**   
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2017</p>    
* @date 2018年8月23日  
* @version 1.0  
*/ 
package rh.springcloud.mycat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import rh.springcloud.mycat.service.SpringRibbonService;

/**   
* <p>Description: </p>  
* @author ruanhang  
* @date 2018年8月23日  
*/
@RestController
public class SpringRibbonController {

	@Autowired
	SpringRibbonService service;
	
    @RequestMapping("hello")
    public String port() {
        return service.port();
    }

}
