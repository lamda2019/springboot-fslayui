package com.wsc.service.impl;

import com.github.pagehelper.PageHelper;
import com.wsc.mapper.UserMapper;
import com.wsc.pojo.City;
import com.wsc.pojo.User;
import com.wsc.service.UserService;
import com.wsc.tools.BaseServiceImpl;
import com.wsc.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {
    @Autowired
    UserMapper userMapper;

    public PageBean<User> findUserByPage(int currentPage, int pageSize) {
        //设置分页信息，分别是当前页数和每页显示的总记录数【记住：必须在mapper接口中的方法执行之前设置该分页信息】
        PageHelper.startPage(currentPage, pageSize);
         //全部用户
        List<User> allUser = userMapper.findAll();
        //总记录数
        int countNums = userMapper.countUser();
        PageBean<User> pageData = new PageBean<>(currentPage, pageSize, countNums);
        pageData.setItems(allUser);
        return pageData;
    }

    @Override
    public List<City> getCityById(int parentid){
        return userMapper.getCity(parentid);
    }

    @Override
    public User getUserInfoById(int id) {
        return userMapper.getUserInfoById(id);
    }

    @Override
    public void deleteUserInfo(int id) {
        userMapper.deleteUserInfo(id);
    }

    @Override
    public void deletePatchUserInfo(int[] id) {
        userMapper.deletePatchUserInfo(id);
    }

}