package com.benny.codersdiningroom.entity;

import javax.persistence.*;

@Entity
@Table(name = "t_order")
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
