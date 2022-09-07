package com.zoolatech.registration.validator;

import com.zoolatech.registration.user.StubUser;
import com.zoolatech.registration.user.User;

public class StubValidator implements Validator{
    private final String userName;
    private final String userPassword;

    public StubValidator(String userName, String userPassword) {
        System.out.println("Hello from StubValidator");
        this.userName = userName;
        this.userPassword = userPassword;
    }

    @Override
    public boolean isValid() {
        if(userName.isEmpty() || userPassword.isEmpty()) {
            System.out.println("Invalid input");
            return false;
        }
        System.out.println("Right input");
        return true;
    }
}