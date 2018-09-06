package rh.springcloud.mycat.mapper.user;

import java.util.List;

import rh.springcloud.mycat.entity.user.UserInfo;

public interface UserInfoMapper {
    UserInfo selectByPrimaryKey(Integer id);
    
    public void insertUserBatch(List<UserInfo> entitys);
}