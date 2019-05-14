package com.wsc.controller;


import com.alibaba.fastjson.JSONObject;
import com.wsc.pojo.City;
import com.wsc.pojo.User;
import com.wsc.service.UserService;
import com.wsc.util.PageBean;
import com.wsc.util.Result;
import com.wsc.util.ResultGenerator;
import org.apache.ibatis.annotations.Options;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Date;
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
    public Result userPage(int pageNum, int pageSize,@RequestParam(value="id",defaultValue = "-1") int id,@RequestParam(value="name",defaultValue = "") String name,@RequestParam(value="createDate",defaultValue = "") String createDate){

        PageBean<User> pageData= userService.findUserByPage(pageNum, pageSize,id,name,createDate);

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

    @RequestMapping(value="getCity",method = RequestMethod.POST)
    @ResponseBody
    public Result getCity(int parentid){
        List<City> list= userService.getCityById(parentid);
        JSONObject json=new JSONObject();
        json.put("data",list);
        return ResultGenerator.genSuccessResult(json);
    }

    /**
     * 上传文件
     */
    @PostMapping("/upload")
    @ResponseBody
    public Result upload(@RequestParam("file") MultipartFile file) {
        if (file.isEmpty()) {
            return ResultGenerator.genFailResult("上传失败，请选择文件");
        }
        String fileName = file.getOriginalFilename();
        String filePath = "D:\\";
        File dest = new File(filePath + fileName);
        try {
            file.transferTo(dest);
            //坑2，返回数据必须为json，格式固定，必须有results.data.filePath
            JSONObject json=new JSONObject();
            JSONObject json1=new JSONObject();
            json1.put("filePath",filePath + fileName);
            json.put("data",json1);
            return ResultGenerator.genSuccessResult(json);
        } catch (IOException e) {
            ResultGenerator.genFailResult("上传失败!"+e);
        }
        return ResultGenerator.genFailResult("上传失败!");
    }

    /**
     * 保存用户信息
     */

    @RequestMapping(value="saveUserInfo",method = RequestMethod.POST)
    @ResponseBody
    public Result saveUserInfo(User user){
        user.setModifiedTime(new Date());
        int result= userService.save(user);
        JSONObject json=new JSONObject();
        json.put("data",result);
        return ResultGenerator.genSuccessResult(json);
    }

    /**
     * 保存用户信息
     */

    @RequestMapping(value="getUserInfoById",method = RequestMethod.GET)
    @ResponseBody
    public Result getUserInfoById(int id){
        User user= userService.getUserInfoById(id);
        JSONObject json=new JSONObject();
        json.put("data",user);
        return ResultGenerator.genSuccessResult(json);
    }

    /**
     * 更新用户信息
     */

    @RequestMapping(value="updateUserInfo",method = RequestMethod.POST)
    @ResponseBody
    public Result updateUserInfo(User user){
        int result=userService.update(user);
        JSONObject json=new JSONObject();
        json.put("data",result);
        return ResultGenerator.genSuccessResult(json);
    }

    /**
     * 删除用户信息
     */

    @RequestMapping(value="deleteUserInfo",method = RequestMethod.GET)
    @ResponseBody
    public Result deleteUserInfo(int id){
        userService.deleteUserInfo(id);
        JSONObject json=new JSONObject();
        json.put("data",1);
        return ResultGenerator.genSuccessResult(json);
    }

    /**
     *  批量删除用户信息
     */

    @RequestMapping(value="deletePatchUserInfo",method = RequestMethod.GET)
    @ResponseBody
    public Result deletePatchUserInfo(int[] id){
        //坑，id是数组
        userService.deletePatchUserInfo(id);
        JSONObject json=new JSONObject();
        json.put("data",1);
        return ResultGenerator.genSuccessResult(json);
    }

}