package com.wsc.pojo;


import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "T_USER")
public class User {
    @Id
    @Column(name = "ID")
    private int id;
    @Column(name = "CITY")
    private String city;
    @Column(name = "CREATEDTIME")
    private String createdTime;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
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
}
