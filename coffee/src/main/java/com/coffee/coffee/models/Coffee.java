package com.coffee.coffee.models;

import java.util.UUID;

public class Coffee {
    
    private final String id;
    private String name;

    Coffee(String id, String name){
        this.id = id;
        this.name = name;
    }

    public Coffee(String name){
        this(UUID.randomUUID().toString(), name);
    }

    public String getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}
