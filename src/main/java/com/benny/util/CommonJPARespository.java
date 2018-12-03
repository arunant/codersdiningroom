package com.benny.util;

import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

/**
 * @Auther: HANBIN
 * @Date: 2018-12-03 14:43
 * @Description:
 */
public interface CommonJPARespository<T,ID extends Serializable> extends JpaRepository<T,ID> {
}
