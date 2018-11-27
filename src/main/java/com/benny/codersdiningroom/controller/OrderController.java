package com.benny.codersdiningroom.controller;

import com.benny.codersdiningroom.entity.Dishes;
import com.benny.codersdiningroom.repository.DishesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    private DishesRepository dishesRepository;

    @RequestMapping(value = "/cdr/dishes")
    public List<Dishes> getDishes() {
        return dishesRepository.findAll();
    }
}
