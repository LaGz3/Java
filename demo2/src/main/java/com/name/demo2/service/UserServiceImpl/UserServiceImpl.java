package com.name.demo2.service.UserServiceImpl;


import com.name.demo2.entity.User;
import com.name.demo2.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public User findbylogin(User user){
        if("admin".equals(user.getUsername())&&"123456".equals(user.getPassword())){
            //用户名,密码正确,登录成功
            user.setId(100);
            return user;
        }
        return null;
    }
}

