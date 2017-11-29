package com.benny.codersdiningroom.repository;

import com.benny.codersdiningroom.entity.Dishes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DishesRepository extends JpaRepository<Dishes,String> {
}
