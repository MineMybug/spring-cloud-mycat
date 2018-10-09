package rh.springcloud.mycat.mapper.user;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import rh.springcloud.mycat.entity.user.UserInfo;

public interface UserInfoMapper {
    UserInfo selectByPrimaryKey(Integer id);
    
    public void insertUserBatch(@Param("list")List<UserInfo> entitys);
}