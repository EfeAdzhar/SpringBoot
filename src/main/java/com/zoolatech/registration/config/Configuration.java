package com.zoolatech.registration.config;

import com.zoolatech.registration.printer.Printer;
import com.zoolatech.registration.printer.StubPrinter;
import com.zoolatech.registration.registration.StubRegistration;
import com.zoolatech.registration.user.StubUser;
import com.zoolatech.registration.user.User;
import com.zoolatech.registration.validator.StubValidator;
import com.zoolatech.registration.validator.Validator;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {

    public Configuration() {
        System.out.println("Hello from Configuration");
    }

    @Bean
    public Validator getStubValidator(User user) {
        return new StubValidator(user.getName(), user.getPassword());
    }

    @Bean
    public Printer getStubPrinter() {
        return new StubPrinter();
    }

    @Bean
    public StubRegistration getStubRegistration(User user, Validator validator, Printer printer) {
        return new StubRegistration(user, validator, printer);
    }
}
