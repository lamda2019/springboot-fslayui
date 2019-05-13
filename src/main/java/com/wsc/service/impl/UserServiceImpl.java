package com.wsc.service.impl;

import com.github.pagehelper.PageHelper;
import com.wsc.mapper.UserMapper;
import com.wsc.pojo.Province;
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

    public List<Province> getProvinceById(int parentid){
        return userMapper.getProvince(parentid);
    }

}