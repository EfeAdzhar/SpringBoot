package com.zoolatech.registration.printer;

import com.zoolatech.registration.user.User;

public class StubPrinter implements Printer{

    public StubPrinter() {
        System.out.println("Hello from StubPrinter");
    }
    @Override
    public void printUser(User user) {
        System.out.println(user.getName());
    }
}