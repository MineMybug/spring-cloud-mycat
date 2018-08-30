/**   
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2017</p>    
* @date 2018年8月27日  
* @version 1.0  
*/ 
package rh.springcloud.mycat.example.userTest;

import rh.springcloud.mycat.example.MyAnnotation;

/**   
* <p>Description: </p>  
* @author ruanhang  
* @date 2018年8月27日  
*/
public class MyAnnotationTest {
	
	public static void main(String[] args) {
		Test();
	}
	
	@MyAnnotation(value = "12")
	public static void Test(){
		System.out.println("hello");
	}

}
