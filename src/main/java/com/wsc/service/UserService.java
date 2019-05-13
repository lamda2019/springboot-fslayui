package com.wsc.service;

import com.wsc.pojo.Province;
import com.wsc.pojo.User;
import com.wsc.tools.BaseService;
import com.wsc.util.PageBean;

import java.util.List;

public interface UserService extends BaseService<User> {
    public PageBean<User> findUserByPage(int currentPage, int pageSize);

    public List<Province> getProvinceById(int parentid);
}
