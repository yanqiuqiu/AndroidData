package com.example.mvpdemo.api.model;

import java.io.Serializable;

public class Cook implements Serializable {
    private int id;
    private String name;//名称
    private String  food;//食物
    private String img;//图片
    private String images;//图片,
    private String description;//描述
    private String keywords;//关键字
    private String message;//资讯内容
    private int count ;//访问次数
    private int fcount;//收藏数
    private int rcount;//评论读数

    @Override
    public String toString() {
        return "Cook{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", food='" + food + '\'' +
                ", img='" + img + '\'' +
                ", images='" + images + '\'' +
                ", description='" + description + '\'' +
                ", keywords='" + keywords + '\'' +
                ", message='" + message + '\'' +
                ", count=" + count +
                ", fcount=" + fcount +
                ", rcount=" + rcount +
                '}';
    }
}
