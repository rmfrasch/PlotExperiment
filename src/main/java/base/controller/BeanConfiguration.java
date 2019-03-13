package base.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import base.beans.Corn;
import base.beans.FieldDetails;

@Configuration
public class BeanConfiguration {

	@Bean
	public FieldDetails fieldDetails() {
		FieldDetails bean = new FieldDetails(3500, 2, 20);
		return bean;
	}

	@Bean
	public Corn corn() {
		Corn bean = new Corn(100, true, true);
		return bean;
	}

}