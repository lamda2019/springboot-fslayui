package com.wsc.mapper;


import com.wsc.pojo.City;
import com.wsc.pojo.User;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Param;
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

    @Select("select * from city where parentid = #{parentid}")
    List<City> getCity(int parentid);

    @Select("select * from t_user where id = #{id}")
    User getUserInfoById(int id);

    @Select("delete from t_user where id = #{id}")
    void deleteUserInfo(int id);

    @DeleteProvider(type = UserSqlProvider.class, method = "deletePatchUserInfo")
    void deletePatchUserInfo(@Param("id") int[] id);

}
