package com.github.antoniodvr.startupactuatortest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.metrics.buffering.BufferingApplicationStartup;

@SpringBootApplication
public class StartupActuatorTestApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(StartupActuatorTestApplication.class);
		app.setApplicationStartup(new BufferingApplicationStartup(1000));
		app.run(args);
	}

}
