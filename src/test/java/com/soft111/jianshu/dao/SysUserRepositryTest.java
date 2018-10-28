package com.soft111.jianshu.dao;

import com.soft111.jianshu.entity.SysUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SysUserRepositryTest {
    @Resource
    private SysUserRepositry sysUserRepositry;

    @Test
    public void addUser(){
//        SysUser sysUser = new SysUser("aaa@qq.com","aaa","ywy","one.png",
// "aaaaaaaaaaaaaa",15554,666);

        SysUser sysUser=SysUser.builder()
                .email("ccc@qq.com")
                .password("ccc")
                .nickname("yyy")
                .avatar("three.png")
                .description("ccccc")
                .wordsCount(21264)
                .likeCount(5122)
                .build();
        sysUserRepositry.save(sysUser);
        System.out.println(sysUser);
    }
    @Test
    public void findSysUserByEmail() {
        SysUser sysUser = sysUserRepositry.findSysUserByEmail("aaa@qq.com");
        if (sysUser != null) {
            System.out.println(sysUser);
        }
    }

    @Test
    public void findHotUsers() {
        List<SysUser>sysUserList=sysUserRepositry.findHotUsers();
        sysUserList.forEach(sysUser -> System.out.println(sysUser));
    }
}