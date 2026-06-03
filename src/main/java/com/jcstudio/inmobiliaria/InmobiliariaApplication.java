package com.jcstudio.inmobiliaria;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;
import java.sql.Connection;

@SpringBootApplication
public class InmobiliariaApplication {

	private static final Logger log = LoggerFactory.getLogger(InmobiliariaApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(InmobiliariaApplication.class, args);
	}

	@Bean
	public CommandLineRunner testDataSource(DataSource dataSource) {
		return args -> {
			if (dataSource == null) {
				log.warn("No DataSource configured.");
				return;
			}
			try (Connection conn = dataSource.getConnection()) {
				log.info("Successfully obtained a connection to the database: {}", conn.getMetaData().getURL());
			} catch (Exception ex) {
				log.error("Failed to obtain DB connection:", ex);
			}
		};
	}

}
