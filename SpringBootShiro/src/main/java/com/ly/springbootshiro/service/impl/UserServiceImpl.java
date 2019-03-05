package com.ly.springbootshiro.service.impl;

import com.ly.springbootshiro.common.util.ResultUtil;
import com.ly.springbootshiro.common.vo.PageVo;
import com.ly.springbootshiro.common.vo.ResultVo;
import com.ly.springbootshiro.dao.SysUserMapper;
import com.ly.springbootshiro.pojo.SysUser;
import com.ly.springbootshiro.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private SysUserMapper userMapper;

    @Override
    public ResultVo save(SysUser user, int rid) {
        userMapper.insert(user);
        return null;
    }

    @Override
    public PageVo<SysUser> queryPage(int page, int limit) {
        return null;
    }

    @Override
    public ResultVo login(String name, String password) {

        SysUser user = userMapper.selectByName(name);
        if (user != null) {
            if (user.getPassword().equals(password)){
                // 登录成功
                return ResultUtil.exec(true,"OK", user);
            }
        }
        return ResultUtil.exec(false,"用户名或密码不正确", null);
    }
}
