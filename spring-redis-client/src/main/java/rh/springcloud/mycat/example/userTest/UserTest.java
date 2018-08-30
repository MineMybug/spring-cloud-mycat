/**   
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2017</p>    
* @date 2018年8月27日  
* @version 1.0  
*/ 
package rh.springcloud.mycat.example.userTest;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import rh.springcloud.mycat.example.Example.Examples;
import rh.springcloud.mycat.example.userApi.PasswordUtils;

/**   
* <p>Description: </p>  
* @author ruanhang  
* @date 2018年8月27日  
*/
public class UserTest {
	
	public static void main(String[] args) {
		List<Integer> userCase = new ArrayList<Integer>();
		Collections.addAll(userCase, 47,48,49,50);
		trackUserCase(userCase,PasswordUtils.class);
	}

	/**    
	 * <p>Description:反射获取对象并使用 </p>  
	 * @param userCase
	 * @param class1  
	 */  
	private static void trackUserCase(List<Integer> userCase, Class<?> class1) {

		for(Method method : class1.getDeclaredMethods()){
			//获取注解的对象
			Examples ex = method.getAnnotation(Examples.class);
			if(ex !=null){
				System.out.println("Found Use Case:" + ex.id() + " " 
						+ ex.description());
				userCase.remove(new Integer(ex.id()));
			}
		}
		
	    for (int i : userCase) {
	        System.out.println("Warning: Missing use case-" + i);
	    }
	}

}
