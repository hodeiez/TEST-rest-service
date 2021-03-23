package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Hodei Eceiza
 * Date: 3/23/2021
 * Time: 21:32
 * Project: rest-service
 * Copyright: MIT
 */
@RestController
public class GreetingController {
    private static final String template ="Kaixo %s!";
    private final AtomicLong counter=new AtomicLong();

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name",defaultValue="Mundua") String name){
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}
