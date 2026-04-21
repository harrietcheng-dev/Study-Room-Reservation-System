package com.study.reservation;

import com.study.reservation.entity.User;
import com.study.reservation.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class TestController {

    // 自动连接你刚才写的 Mapper，相当于给数据库打通了电话
    @Autowired
    private UserMapper userMapper;

    // 设置网页访问地址为 /testDb
    @GetMapping("/testDb")
    public List<User> testDb() {
        // selectList(null) 意思是“查询表里的所有数据”
        return userMapper.selectList(null);
    }
}