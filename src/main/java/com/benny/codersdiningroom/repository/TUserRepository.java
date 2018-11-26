package com.benny.codersdiningroom.repository;

import com.benny.codersdiningroom.entity.TUser;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Id;

/**
 * @Auther: HANBIN
 * @Date: 2018-11-26 17:17
 * @Description:
 */
public interface TUserRepository extends JpaRepository<TUser,Integer> {
}
