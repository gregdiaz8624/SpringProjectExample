package com.revature.config;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.revature.beans.Box;

//this where we will tell spring , the framework how to create our beans
//providing it configuration 
//can be done in an xml file
//we will be using annotaions. 
//take a look at the shared repo for examples of xml configuation


@Configuration
public class BoxConfig {
	
	//when and how our bean is instantiated 
	// whether singleton or protype
	@Bean
	@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
	public Box getSingleBox() {
		System.out.println("Getting you a box...");
		return new Box();
	}
	
	@Bean
	@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public Box getNewBox() {
		System.out.println("Getting you a NEW box...");
		return new Box(8);
	}

}
