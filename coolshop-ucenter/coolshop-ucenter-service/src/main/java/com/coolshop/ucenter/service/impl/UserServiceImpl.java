package com.coolshop.ucenter.service.impl;

import com.coolshop.ucenter.dao.UserDao;
import com.coolshop.ucenter.model.UserModel;
import com.coolshop.ucenter.service.UserService;
import org.apache.commons.lang3.ArrayUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    private static Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    UserDao userDao;

    @Override
    public void save(UserModel model) {

        this.userDao.save(model);
    }

    @Override
    public void saveList(List<UserModel> modelList) {

        this.userDao.saveList(modelList);
    }

    @Override
    public int update(UserModel model) {

        return this.userDao.update(model);
    }

    @Override
    public int delete(Object id) {

        return this.userDao.delete(id);
    }

    @Override
    public UserModel find(Object id) {

        return this.userDao.find(id);
    }

    @Override
    public List<UserModel> findAll() {

        return this.userDao.findAll();
    }

    @Override
    public Long count() {

        return this.userDao.count();
    }

    @Override
    public int delete(long[] ids) {
        if (ArrayUtils.isEmpty(ids)) return 0;
        for (int i = 0; i < ids.length; i++) {
            this.userDao.delete(ids[i]);
        }
        return 1;
    }

    @Override
    public UserModel findUserByName(String username) {

        return this.userDao.findUserByName(username);
    }

    @Override
    public UserModel findUserByPhone(String phone) {

        return this.userDao.findUserByPhone(phone);
    }

    @Override
    public UserModel findUserByEmail(String email) {

        return this.userDao.findUserByPhone(email);
    }

    @Override
    public UserModel findPhone(String phone) {
        return this.userDao.findPhone(phone);
    }
}
