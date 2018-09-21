/**   
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2017</p>    
* @date 2018年9月6日  
* @version 1.0  
*/ 
package rh.springcloud.mycat.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rh.springcloud.mycat.entity.user.UserInfo;
import rh.springcloud.mycat.mapper.user.UserInfoMapper;

/**   
* <p>Description: </p>  
* @author ruanhang  
* @date 2018年9月6日  
*/
@Service
public class UserService {
	
	@Autowired
	UserInfoMapper userInfoMapper;
	
	public List<UserInfo> insertUserBatch(){
		List<UserInfo> entitys = new ArrayList<UserInfo>();
		UserInfo userInfo1 = new UserInfo();
		userInfo1.setName("asd");
		userInfo1.setPassword("213");
		userInfo1.setStatus(1);
		entitys.add(userInfo1);
		UserInfo userInfo2 = new UserInfo();
		userInfo2.setName("sdf");
		userInfo2.setPassword("213das");
		userInfo2.setStatus(1);
		entitys.add(userInfo1);
		userInfoMapper.insertUserBatch(entitys);
		
		for (UserInfo userInfo : entitys) {
			System.out.println(userInfo.getId());
		}
        return entitys;
        
	}

}
