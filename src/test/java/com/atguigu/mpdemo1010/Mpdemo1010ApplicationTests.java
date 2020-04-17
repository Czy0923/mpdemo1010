package com.atguigu.mpdemo1010;

import com.atguigu.mpdemo1010.entity.User;
import com.atguigu.mpdemo1010.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Mpdemo1010ApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void findAll() {
        List<User> users = userMapper.selectList(null);
        System.out.println(users);
    }

    @Test
    public void addUser() {
        User user = new User();
        user.setName("褚憨憨");
        user.setAge(35);
        user.setEmail("churuigongzuo@163.com");
        int insert = userMapper.insert(user);
        System.out.println(insert + "-----------------------------");
    }

    @Test
    public void UpdateUser() {
        User user = new User();
        user.setId(1250592237360390146l);
        user.setName("褚呵呵1");
        int i = userMapper.updateById(user);
        System.out.println(i);
    }

}
