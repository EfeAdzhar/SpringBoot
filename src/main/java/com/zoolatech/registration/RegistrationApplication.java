package com.zoolatech.registration;

import com.zoolatech.registration.printer.Printer;
import com.zoolatech.registration.printer.StubPrinter;
import com.zoolatech.registration.registration.StubRegistration;
import com.zoolatech.registration.user.StubUser;
import com.zoolatech.registration.user.User;
import com.zoolatech.registration.validator.StubValidator;
import com.zoolatech.registration.validator.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RegistrationApplication implements CommandLineRunner {

	private final StubRegistration stubRegistration;

	public RegistrationApplication(StubRegistration stubRegistration) {
		this.stubRegistration = stubRegistration;
	}

	public static void main(String[] args) {

		SpringApplication.run(RegistrationApplication.class, args);
	}

	@Override
	public void run(String... args) {
    stubRegistration.getUser();
	}
}