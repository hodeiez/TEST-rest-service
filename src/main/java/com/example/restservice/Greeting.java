package com.example.restservice;

/**
 * Created by Hodei Eceiza
 * Date: 3/23/2021
 * Time: 21:30
 * Project: rest-service
 * Copyright: MIT
 */
public class Greeting {
    private final long id;
    private final String content;
    public Greeting(long id, String content){
        this.id=id;
        this.content=content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
