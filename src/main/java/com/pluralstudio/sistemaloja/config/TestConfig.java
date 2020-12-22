package com.pluralstudio.sistemaloja.config;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.pluralstudio.sistemaloja.services.DbService;

@Configuration
@Profile("test")
public class TestConfig {
	
	@Autowired
	private DbService dbServive;
	
	@Bean
	public boolean instanciateDatabase() throws ParseException {
		dbServive.instanciateTestDatabase();
		return true;
	}

}
