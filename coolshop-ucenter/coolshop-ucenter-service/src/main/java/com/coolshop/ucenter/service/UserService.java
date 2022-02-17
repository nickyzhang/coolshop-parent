package com.coolshop.ucenter.service;

import com.coolshop.ucenter.model.UserModel;
import java.util.List;

public interface UserService {

    void save(UserModel model);

    void saveList(List<UserModel> modelList);

    int update(UserModel model);

    int delete(Object id);

    UserModel find(Object id);

    List<UserModel> findAll();

    Long count();

    int delete(long[] ids);

    UserModel findUserByName(String username);

    UserModel findUserByPhone(String phone);

    UserModel findUserByEmail(String email);

    UserModel findPhone(String phone);
}
