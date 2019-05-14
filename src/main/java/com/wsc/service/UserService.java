package com.wsc.service;

import com.wsc.pojo.City;
import com.wsc.pojo.User;
import com.wsc.tools.BaseService;
import com.wsc.util.PageBean;

import java.util.List;

public interface UserService extends BaseService<User> {
    public PageBean<User> findUserByPage(int currentPage, int pageSize,int id,String name,String createDate);

    public List<City> getCityById(int parentid);

    public User getUserInfoById(int id);

    public void deleteUserInfo(int id);

    public void deletePatchUserInfo(int[]  id);
}
