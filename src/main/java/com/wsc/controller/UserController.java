package com.wsc.controller;


import com.wsc.pojo.User;
import com.wsc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user/*")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("list")
    public List<User> list(User user) {
        return userService.list(user);
    }

    @RequestMapping("get")
    public User get(User user) {
        return userService.get(user);
    }

    @RequestMapping("update")
    public int update(User user) {
        return userService.update(user);
    }

    @RequestMapping("save")
    public int save(User user) {
        return userService.save(user);
    }

    @RequestMapping("delete")
    public int delete(User user) {
        return userService.delete(user);
    }

    /**
     * 商品分页功能(集成mybatis的分页插件pageHelper实现)
     *
     * @param currentPage    :当前页数
     * @param pageSize        :每页显示的总记录数
     * @return
     */

    @RequestMapping(value="userPage/{currentPage}/{pageSize}",method = RequestMethod.GET)
    @ResponseBody
    public List<User> userPage(@PathVariable("currentPage")int currentPage,@PathVariable("pageSize") int pageSize){
        return userService.findUserByPage(currentPage, pageSize);
    }

}