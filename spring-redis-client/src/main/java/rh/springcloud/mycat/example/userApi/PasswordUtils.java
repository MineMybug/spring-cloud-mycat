/**   
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2017</p>    
* @date 2018年8月27日  
* @version 1.0  
*/ 
package rh.springcloud.mycat.example.userApi;

import rh.springcloud.mycat.example.Example.Examples;

/**   
* <p>Description:使用注解 </p>  
* @author ruanhang  
* @date 2018年8月27日  
*/
public class PasswordUtils {

	@Examples(id= "47",description = "Passwords must contain at least one numeric")
	public boolean validatePassword(String password){
		return (password.matches("\\w*\\d\\w*"));
	}
	
	@Examples(id = "48")
	public String encryptPassword(String password){
		return new StringBuilder(password).reverse().toString();
	}
}
