package com.wxy.service.user;

import com.wxy.pojo.User;

import java.sql.SQLException;
import java.util.List;

/**
 * @author Administrator
 * @Auther: wuxy
 * @Date: 2021/1/27 - 01 - 27 - 12:59
 * @Description: com.wxy.service.user
 * @version: 1.0
 */
public interface UserService {
    /**
     * 用户登录
     *
     * @param userCode
     * @param userPassword
     * @return
     */
    public User login(String userCode, String userPassword);

    /**
     * 根据userId修改密码
     *
     * @param id
     * @param pwd
     * @return
     */
    public boolean updatePwd(int id, String pwd);

    /**
     * 根据条件查询用户表记录数
     *
     * @param queryUserName
     * @param queryUserRole
     * @return
     */
    public int getUserCount(String queryUserName, int queryUserRole);

    /**
     * 根据条件查询用户列表
     *
     * @param queryUserName
     * @param queryUserRole
     * @return
     */
    public List<User> getUserList(String queryUserName, int queryUserRole, int currentPageNo, int pageSize);

    /**
     * 增加用户信息
     *
     * @param user
     * @return
     */
    public boolean add(User user);

    /**
     * 根据ID删除user
     *
     * @param delId
     * @return
     */
    public boolean deleteUserById(Integer delId);

    /**
     * 修改用户信息
     *
     * @param user
     * @return
     */
    public boolean modify(User user);

    /**
     * 根据userCode查询出User
     *
     * @param userCode
     * @return
     */
    public User selectUserCodeExist(String userCode);

    /**
     * 根据ID查找user
     *
     * @param id
     * @return
     */
    public User getUserById(String id);

}
