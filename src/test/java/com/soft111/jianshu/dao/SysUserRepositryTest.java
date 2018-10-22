package com.soft111.jianshu.dao;

import com.soft111.jianshu.entity.SysUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SysUserRepositryTest {
    @Resource
    private SysUserRepositry sysUserRepositry;

//    @Test
//    public void addUser(){
//        SysUser sysUser = new SysUser(1,"aaa@qq.com","aaa","ywy","one.png","aaaaaaaaaaaaaaaaaaaaa",111,222);
//    }
//    private Integer userId;
//    private String email;
//    private String password;
//    private String nickname;
//    private String avatar;
//    private String description;
//    private Integer wordsCount;
//    private Integer likeCount;
    @Test
    public void findSysUserByEmail() {
        SysUser sysUser = sysUserRepositry.findSysUserByEmail("aaa@qq.com");
        if (sysUser != null) {
            System.out.println(sysUser);
        }else{
            System.out.println("qqqq");
        }
    }
}