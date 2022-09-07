package com.zoolatech.registration.registration;

import com.zoolatech.registration.printer.Printer;
import com.zoolatech.registration.printer.StubPrinter;
import com.zoolatech.registration.user.StubUser;
import com.zoolatech.registration.user.User;
import com.zoolatech.registration.validator.StubValidator;
import com.zoolatech.registration.validator.Validator;

public class StubRegistration {

    private User user;
    private Validator validator;
    private Printer printer;

    public StubRegistration(User user, Validator validator, Printer printer) {
        this.user = new StubUser();
        this.validator = new StubValidator(user.getName(), user.getPassword());
        this.printer = new StubPrinter();
    }

    public void getUser() {
        if(validator.isValid()) {
            printer.printUser(user);
        }
    }
}