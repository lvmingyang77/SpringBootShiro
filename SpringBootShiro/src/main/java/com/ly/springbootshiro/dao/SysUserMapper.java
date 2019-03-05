package com.ly.springbootshiro.dao;

import com.ly.springbootshiro.pojo.SysUser;
import org.apache.ibatis.annotations.Param;

public interface SysUserMapper {

    int insert(SysUser record);

    SysUser selectByI(Integer id);

    SysUser selectByName(String name);

    int updateByIdSelective(SysUser record);

    int updateByIdFlag(@Param("id") int id , @Param("flag") int flag);

    // 找回密码
    int updateByIdPassword(@Param("id") int id , @Param("password") int password);



}