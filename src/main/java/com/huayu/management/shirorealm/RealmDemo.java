package com.huayu.management.shirorealm;


import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

public class RealmDemo extends AuthorizingRealm {


    /**
     * 认证
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
       /* UsernamePasswordToken token=(UsernamePasswordToken)authenticationToken;
        String userNum=token.getUsername();
        Employee userInfo=new Employee();
        userInfo.setUsernumber(Integer.parseInt(userNum));

        Employee userInfo1=employeeMapper.selectOne(userInfo);
        if(userInfo1==null){
            throw new UnknownAccountException("此用户不存在");
        }
        ByteSource byteSource=ByteSource.Util.bytes(String.valueOf(userInfo1.getUsernumber()));
        AuthenticationInfo authenticationInfo=
                new SimpleAuthenticationInfo(userInfo1.getUsernumber(),userInfo1.getPassword(),byteSource,getName());
        */return null;
    }

    /**
     * 授权器
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {

            /*//1、先拿到用户名
            Object object=principalCollection.getPrimaryPrincipal();
            //2、根据用户名查询数据库得到角色和权限
            Employee userInfo=new Employee();
            userInfo.setUsernumber((Integer)object);
            Employee userInfo1=employeeMapper.selectOne(userInfo);
            String []a=userInfo1.getPostId().split(",");
            //角色
            Set<String> roles=new HashSet<>();
            for (int i = 0; i <a.length ; i++) {
                roles.add(a[i]);
            }
            EntityWrapper wrapper=new EntityWrapper<>();
            wrapper.in("postid",userInfo1.getPostId());
            List<build> builds=buildIService.selectList(wrapper);
            //权限
            Set<String> permission1=new HashSet<String>();
            for (build b:builds) {
                EntityWrapper wrapper1=new EntityWrapper<>();
                wrapper.in("id",b.getPermissionid());
                List<Permission> list=permissionMapperIService.selectList(wrapper1);
                for (Permission p:list){
                    permission1.add(p.getUrl());
                }
            }
        try {
            //3、返回授权的信息类
            SimpleAuthorizationInfo authorizationInfo=new SimpleAuthorizationInfo();
            authorizationInfo.setRoles(roles);
            authorizationInfo.addStringPermissions(permission1);
            return authorizationInfo;
        } catch (UnknownAccountException e) {
            try {
                throw  new MyExecption("无权限操作");
            } catch (MyExecption myExecption) {
                myExecption.printStackTrace();
            }
        }
*/
        return null;
    }
}
