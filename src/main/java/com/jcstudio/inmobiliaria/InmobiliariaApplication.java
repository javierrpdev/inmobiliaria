package com.jcstudio.inmobiliaria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication(exclude = {
//		org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration.class,
//		org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration.class
//})

@SpringBootApplication
public class InmobiliariaApplication {

	public static void main(String[] args) {
		SpringApplication.run(InmobiliariaApplication.class, args);
	}

}
