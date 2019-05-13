package com.wsc.service;

import com.wsc.pojo.User;
import com.wsc.tools.BaseService;

import java.util.List;

public interface UserService extends BaseService<User> {
    public List<User> findUserByPage(int currentPage, int pageSize);
}
