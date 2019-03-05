package com.ly.springbootshiro.service;

import com.ly.springbootshiro.common.vo.PageVo;
import com.ly.springbootshiro.common.vo.ResultVo;
import com.ly.springbootshiro.pojo.SysUser;

public interface UserService {

    // 新增
    ResultVo save(SysUser user, int rid);
    // 查询分页
    PageVo<SysUser> queryPage(int page, int limit);
    // 登录-校验
    ResultVo login(String name, String password);

}
