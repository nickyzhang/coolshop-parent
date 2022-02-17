package com.coolshop.ucenter.dao;

import com.coolshop.ucenter.model.UserModel;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao extends BaseDao<UserModel> {

    UserModel findUserByName(String username);

    UserModel findUserByPhone(String phone);

    UserModel findUserByEmail(String email);

    UserModel findPhone(String phone);
}
