package com.benny.codersdiningroom.controller;

import com.benny.codersdiningroom.entity.SignInRecord;
import com.benny.codersdiningroom.entity.TUser;
import com.benny.codersdiningroom.repository.SignInRecordRepository;
import com.benny.codersdiningroom.repository.TUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: HANBIN
 * @Date: 2018-11-26 17:18
 * @Description:
 */
@RestController
public class UserController {
    @Autowired
    private TUserRepository tUserRepository;
    @Autowired
    private SignInRecordRepository signInRecordRepository;
    @RequestMapping(value = "/adduser")
    public TUser addUser(TUser user){
        return tUserRepository.saveAndFlush(user);
    }
    @RequestMapping(value = "/signin")
    public SignInRecord signIn(SignInRecord record){
        return signInRecordRepository.saveAndFlush(record);
    }
}
