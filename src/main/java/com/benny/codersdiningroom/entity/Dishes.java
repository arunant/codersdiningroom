package com.benny.codersdiningroom.entity;

import javax.persistence.*;

@Entity
@Table(name = "t_dishes")
public class Dishes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    /**
     * 菜名
     */
    private String name;
    /**
     * 菜品代码
     */
    private String code;
    /**
     * 菜品价格
     */
    private float price;
    /**
     * 描述
     */
    private String mark;

    public Dishes() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }
}
