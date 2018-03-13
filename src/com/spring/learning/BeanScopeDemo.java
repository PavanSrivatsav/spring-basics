package com.spring.learning;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemo {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"beanLifecycle-applicationContext.xml");

		Coach b = context.getBean("singleTonTesting", Coach.class);
		System.out.println(b.getDailyWorkout());
		context.close();

	}

}
