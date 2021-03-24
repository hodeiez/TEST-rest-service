package com.example.restservice;

import org.springframework.web.bind.annotation.CrossOrigin;
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
    //CrossOrigin to use locally with liveServer from visualStudioCode
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name",defaultValue="Mundua") String name){
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/greeting2")
    public Greeting greeting2(@RequestParam(value="name",defaultValue="Mundua") String name){

        return new Greeting(counter.incrementAndGet(), String.format(template, Greeting.reverseName(name)));
    }
}
