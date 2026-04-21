package com.study.reservation.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("users") // 关联刚才在 Navicat 建的 users 表
public class User {
    @TableId
    private Integer id;
    private String username;
    private String password;
    private String role;
}
