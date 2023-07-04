package demo2;



import com.name.demo2.entity.User;
import com.name.demo2.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@SpringBootTest
//告诉spring boot这个是他的测试类,需要用到标准了spring能解析的注解类
//@Controller,@Service, @Mapper
public  class UserServiceTest {
    //@Autowired注入的注解,现在不建议使用了
    //告诉spring现在标注了@Resource的类进行实例化
    @Resource
    private UserService userService;

    @Test
    public void login() {
        User user = new User();
        user.setUsername("admin");
        user.setPassword("123456");

        //获取方法的返回值的命名ctrl+alt+v
        User login = userService.findbylogin(user);
        System.out.println(login);
    }

}
