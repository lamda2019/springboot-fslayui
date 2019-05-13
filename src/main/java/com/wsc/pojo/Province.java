package com.wsc.pojo;

import javax.persistence.Column;
import javax.persistence.Id;

public class Province {
    @Id
    @Column(name = "ID")
    private int id;
    @Column(name = "NAME")
    private String name;

    public Province(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Province{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
