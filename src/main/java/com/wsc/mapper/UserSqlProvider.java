package com.wsc.mapper;

import java.util.Map;

/**
 * 动态生成SQL.
 * <p>
 * 目标：使用Java工具类来替代传统的XML文件.(例如：UserSqlProvider.java <-- UserMapper.xml)
 */
public class UserSqlProvider {

    //批量删除，坑，参数需要@Param， 否则取不到
    public String deletePatchUserInfo(Map map) {
        StringBuilder sb = new StringBuilder();
        int[] id= (int[]) map.get("id");
        sb.append("DELETE FROM t_user WHERE id IN (");
        for (int i = 0; i < id.length; i++) {
            sb.append(id[i]+",");
        }
        if ( id.length > 0 ){
            sb.deleteCharAt(sb.lastIndexOf(","));
        }
        sb.append(")");
        return sb.toString();

    }



}