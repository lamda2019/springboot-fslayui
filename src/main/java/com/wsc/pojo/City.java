package com.wsc.pojo;

import javax.persistence.Column;
import javax.persistence.Id;

public class City {
    @Id
    @Column(name = "ID")
    private int id;
    @Column(name = "PARENTID")
    private int parentid;
    @Column(name = "NAME")
    private String name;


    public City(int id, int parentid, String name) {
        this.id = id;
        this.parentid = parentid;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getParentid() {
        return parentid;
    }

    public void setParentid(int parentid) {
        this.parentid = parentid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", parentid=" + parentid +
                ", name='" + name + '\'' +
                '}';
    }
}
