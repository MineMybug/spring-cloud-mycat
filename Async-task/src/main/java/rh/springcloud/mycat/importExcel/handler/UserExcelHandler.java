/**   
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2017</p>    
* @date 2018年9月5日  
* @version 1.0  
*/ 
package rh.springcloud.mycat.importExcel.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cn.afterturn.easypoi.handler.impl.ExcelDataHandlerDefaultImpl;
import rh.springcloud.mycat.importExcel.pojo.User;

/**   
* <p>Description: </p>  
* @author ruanhang  
* @date 2018年9月5日  
*/
public class UserExcelHandler extends ExcelDataHandlerDefaultImpl<User>{
	
	private static final Logger logger = LoggerFactory.getLogger(UserExcelHandler.class);
	
	@Override
	public Object importHandler(User obj, String name, Object value) {
		logger.info(name+":"+value);
		return super.importHandler(obj, name, value);
	}

}
