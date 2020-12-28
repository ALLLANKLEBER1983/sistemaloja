package com.pluralstudio.sistemaloja.config;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.pluralstudio.sistemaloja.services.DbService;

@Configuration
@Profile("dev")
public class DevConfig {
	
	@Autowired
	private DbService dbServive;
	
	@Value("${spring.jpa.hibernate.ddl-auto}")
	private String strategy;
	
	@Bean
	public boolean instanciateDatabase() throws ParseException {
		if(!"create".equals(strategy)) {
			return false;
		}
		dbServive.instanciateTestDatabase();
		return true;
	}

}
