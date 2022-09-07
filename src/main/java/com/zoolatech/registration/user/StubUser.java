package com.zoolatech.registration.user;

import lombok.extern.apachecommons.CommonsLog;
import org.springframework.stereotype.Component;

@Component
public class StubUser implements User{
    private  String name = "Efe";
    private  String password = "123";

    public StubUser() {
        System.out.println("Hello from StubUser");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getPassword() {
        return password;
    }
}