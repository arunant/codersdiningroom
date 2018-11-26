package com.benny.codersdiningroom.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderNO;

    public Orders() {
    }

    public Integer getOrderNO() {
        return orderNO;
    }

    public void setOrderNO(Integer orderNO) {
        this.orderNO = orderNO;
    }
}
