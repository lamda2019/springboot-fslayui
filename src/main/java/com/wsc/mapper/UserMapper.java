package com.wsc.mapper;

import com.wsc.pojo.Province;
import com.wsc.pojo.User;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * 继承通用Mapper获取CURD方法
 */
public interface UserMapper extends Mapper<User> {
    @Select("select * from t_user where 1=1")
    List<User> findAll();

    @Select("select count(*) from t_user where 1=1")
    int countUser();

    @Select("select * from province where 1=1")
    List<Province> getProvince(int parentid);

}
