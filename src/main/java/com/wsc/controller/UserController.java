package com.wsc.controller;


import com.wsc.pojo.Province;
import com.wsc.pojo.User;
import com.wsc.service.UserService;
import com.wsc.util.PageBean;
import com.wsc.util.Result;
import com.wsc.util.ResultGenerator;
import net.sf.json.JSONObject;
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
     * 用户分页功能(集成mybatis的分页插件pageHelper实现)
     *
     * @param pageNum    :当前页数
     * @param pageSize        :每页显示的总记录数
     * @return
     */

    @RequestMapping(value="userPage",method = RequestMethod.POST)
    @ResponseBody
    public Result userPage(int pageNum, int pageSize){
        PageBean<User> pageData= userService.findUserByPage(pageNum, pageSize);
        JSONObject json=new JSONObject();
        JSONObject json1=new JSONObject();
        json1.put("pageNum", pageData.getCurrentPage());
        json1.put("pageSize", pageData.getPageSize());
        json1.put("pages", pageData.getTotalPage());
        json1.put("total", pageData.getTotalNum());
        json1.put("list", pageData.getItems());
        json.put("data",json1);
        return ResultGenerator.genSuccessResult(json);
    }

    /**
     * 获取所有省份
     */

    @RequestMapping(value="getProvince",method = RequestMethod.GET)
    @ResponseBody
    public Result getProvince(int parentid){
        List<Province> list= userService.getProvinceById(parentid);
        JSONObject json=new JSONObject();
        json.put("data",list);
        return ResultGenerator.genSuccessResult(json);
    }

}