package com.github.zhangkaitao.shiro.chapter16.dao;

import com.github.zhangkaitao.shiro.chapter16.entity.User;

import java.util.List;

/**
 * <p>User: Huang Ju Fei
 * <p>Date: 14-1-28
 * <p>Version: 1.0
 */
public interface UserDao {

    public User createUser(User user);
    public User updateUser(User user);
    public void deleteUser(Long userId);

    User findOne(Long userId);

    List<User> findAll();

    User findByUsername(String username);

}
