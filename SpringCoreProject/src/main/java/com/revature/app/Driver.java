package com.revature.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.revature.beans.Box;
import com.revature.config.BoxConfig;

public class Driver {
	
	public static void main(String[] args) throws InterruptedException {
		
		ApplicationContext ac = new AnnotationConfigApplicationContext(BoxConfig.class);
		
		Box a = ac.getBean("getSingleBox", Box.class);
				
		System.out.println(a);
		
		a.setVolume(10);
		
		System.out.println(a);
		
		Box b = ac.getBean("getSingleBox", Box.class);
		
		System.out.println(b);
		
		
	}

}
