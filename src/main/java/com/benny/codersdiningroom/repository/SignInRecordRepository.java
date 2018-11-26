package com.benny.codersdiningroom.repository;

import com.benny.codersdiningroom.entity.SignInRecord;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Auther: HANBIN
 * @Date: 2018-11-26 17:17
 * @Description:
 */
public interface SignInRecordRepository extends JpaRepository<SignInRecord,Integer> {
}
