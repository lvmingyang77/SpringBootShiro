package com.ly.springbootshiro.realm;

import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

// 自定义用户的Realm类
// 实现登录许可方法和用户授权方法
public class UserRealm  extends AuthorizingRealm {
    // 授权 查询登录用户的所有权限，并返回
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    // 认证 登录许可 标记是否登录成功
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        // 获取传递的令牌
        UsernamePasswordToken usernamePasswordToken = (UsernamePasswordToken) authenticationToken;
        // 验证令牌是否为空
        if (usernamePasswordToken.getUsername() != null) {

            // 创建认证信息 参数说明：1.用户名 2.密码 3. realm的名字
            SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(usernamePasswordToken.getUsername(),usernamePasswordToken.getPassword(),getName());

            return authenticationInfo;
        }

        return null;
    }
}
