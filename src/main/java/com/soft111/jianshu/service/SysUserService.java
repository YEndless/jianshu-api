package com.soft111.jianshu.service;

import com.soft111.jianshu.entity.LoginUser;
import com.soft111.jianshu.entity.SysUser;
import com.soft111.jianshu.utils.ResponseUtil;

import java.util.List;

public interface SysUserService {
    ResponseUtil userLogin(LoginUser loginUser);

    List<SysUser> getHotUsers();
}
