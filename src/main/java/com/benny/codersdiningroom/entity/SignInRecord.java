package com.benny.codersdiningroom.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * @Auther: HANBIN
 * @Date: 2018-11-26 16:39
 * @Description:
 */
@Entity
@Table(name = "t_sign_in_record")
public class SignInRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Integer userId;
    private Date signInTime = new Date();

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getSignInTime() {
        return signInTime;
    }

    public void setSignInTime(Date signInTime) {
        this.signInTime = signInTime;
    }
}
