package com.coolshop.ucenter.service.test;

import com.coolshop.base.UserNameTools;
import com.coolshop.base.generator.IdGenerator;
import com.coolshop.base.tool.security.EncryptTools;
import com.coolshop.base.tool.security.SaltTools;
import com.coolshop.ucenter.SpringUCenterApplication;
import com.coolshop.ucenter.model.UserModel;
import com.coolshop.ucenter.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;
import java.util.Random;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringUCenterApplication.class)
public class UserServiceTest {

    @Autowired
    UserService userService;

    @Autowired
    IdGenerator idGenerator;

    @Test
    public void testSave(){
        long accountId = idGenerator.generateId();
        UserModel user = new UserModel(accountId,"liruotong123",null,"13211114534","chu.lingxi@foxmail.com",1);
        String salt = SaltTools.getSalt(user.getUsername(),user.getPhone());
        String encodePassword = EncryptTools.encrypt("123abcABC",salt);
        user.setPassword(encodePassword);
        this.userService.save(user);
    }

    @Test
    public void addTestUser() {
        Map<String,String> userInfo = null;
        UserModel userModel = null;
        String salt = null;
        String encodePassword = null;
        for (int i = 1; i <= 500000; i++) {
            userModel = new UserModel();
            userInfo = getUserInfo( i % 2 == 0 ? 2 : 3);
            for (Map.Entry<String,String> entry : userInfo.entrySet()) {
                userModel.setUsername(entry.getKey());
                userModel.setEmail(nextEmail(entry.getValue()));
            }
            userModel.setPhone(nextPhone());
            userModel.setStatus(i % 10000 == 0 ? 0 : 1);
            salt = SaltTools.getSalt(userModel.getUsername(),userModel.getPhone());
            encodePassword = EncryptTools.encrypt("123abcABC",salt);
            userModel.setPassword(encodePassword);
            userModel.setAccountId(idGenerator.generateId());
            this.userService.save(userModel);
        }

    }

    public String nextPhone(){
        String[] prefixs = {"13","15","17","18"};
        StringBuilder sb = new StringBuilder(prefixs[new Random().nextInt(prefixs.length)]);
        int random = new Random().nextInt(999999999);
        if (random < 100000000) {
            random += 100000000;
        }
        while (findPhone(String.valueOf(random))) {
            random += 1;
        }
        return sb.append(String.valueOf(random)).toString();
    }

    public String nextEmail(String emailPrefix) {
        String[] suffixs = {
                "@foxmail.com","@sina.com","@sina.com.cn","@sohu.com","@gmail.com"
        };
        StringBuilder sb = new StringBuilder(emailPrefix);
        int index  = new Random().nextInt(suffixs.length);
        sb.append(suffixs[index]);
        return sb.toString();
    }

    public Map<String, String> getUserInfo(int len){
        return UserNameTools.generateName(len);

    }

    @Test
    public void testDelete() {
        this.userService.delete(20170808111234L);
    }

    public boolean findPhone(String phone) {
        UserModel user = this.userService.findPhone("595242873");
        return user != null;
    }

    @Test
    public void findUserByPassword() {
        UserModel user = this.userService.findUserByName("liruotong123");
        if (user != null) {
            String dest = user.getPassword();
            String src = EncryptTools.encrypt("123abcABC",SaltTools.getSalt(user.getUsername(),user.getPhone()));
            boolean ret = EncryptTools.match(src,dest);
            System.out.println(ret);

        }
    }

    @Test
    public void testFindAll() {
        List<UserModel> userList = this.userService.findAll();
        for (UserModel user : userList) {
            System.out.println(user.toString());
        }
    }


}
