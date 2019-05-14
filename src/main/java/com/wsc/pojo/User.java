package com.wsc.pojo;


import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "T_USER")
public class User {
    @Id
    @Column(name = "ID")
    private Integer id;//坑，int会报错，Integer可接收null
    @Column(name = "CITY")
    private String city;
    @JsonFormat(pattern = "yyyy-MM-dd")//坑，返回给前端日期字符串，日期转字符串
    @DateTimeFormat(pattern="yyyy-MM-dd")//坑，接收前端日期字符串，字符串转日期
    @Column(name = "CREATEDTIME")
    private Date createdTime;
    @JsonFormat(pattern = "yyyy-MM-dd")//大坑，返回jsson，用fastjson封装可转换成功，net.sf.json不能转换
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @Column(name = "MODIFIEDTIME")
    private Date modifiedTime;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "FILEPATH")
    private String filePath;
    @Column(name = "TYPE")
    private String type;
    @Column(name = "SEX")
    private String sex;
    @Column(name = "NAME")
    private String name;
    @Column(name = "STATE")
    private String state;
    @Column(name = "AREA1")
    private String area1;
    @Column(name = "AREA2")
    private String area2;
    @Column(name = "AREA3")
    private String area3;

    public User(Integer id, String city, Date createdTime, Date modifiedTime, String description, String filePath, String type, String sex, String name, String state, String area1, String area2, String area3) {
        this.id = id;
        this.city = city;
        this.createdTime = createdTime;
        this.modifiedTime = modifiedTime;
        this.description = description;
        this.filePath = filePath;
        this.type = type;
        this.sex = sex;
        this.name = name;
        this.state = state;
        this.area1 = area1;
        this.area2 = area2;
        this.area3 = area3;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }



    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getArea1() {
        return area1;
    }

    public void setArea1(String area1) {
        this.area1 = area1;
    }

    public String getArea2() {
        return area2;
    }

    public void setArea2(String area2) {
        this.area2 = area2;
    }

    public String getArea3() {
        return area3;
    }

    public void setArea3(String area3) {
        this.area3 = area3;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }
}
