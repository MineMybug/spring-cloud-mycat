/**   
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2017</p>    
* @date 2018年9月6日  
* @version 1.0  
*/ 
package rh.springcloud.mycat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import rh.springcloud.mycat.entity.user.UserInfo;
import rh.springcloud.mycat.service.UserService;

/**   
* <p>Description: </p>  
* @author ruanhang  
* @date 2018年9月6日  
*/
@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String hello(){
		userService.selectByPrimaryKey();
		return "success";
	}
	
}
