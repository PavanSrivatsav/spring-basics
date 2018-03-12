package com.spring.learning;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringStarter {

	public static void main(String[] args) {

		/*
		 * Coach c = new CricketCoach();
		 * System.out.println(c.getDailyWorkout());
		 */

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Coach c = context.getBean("myBean", Coach.class);
		System.out.println(c.getDailyWorkout());
		System.out.println(c.getDailyFortune());
		context.close();

		System.out.println("==========");
		context.refresh();

		Coach b = context.getBean("setterInjection", Coach.class);
		System.out.println(b.getDailyWorkout());
		System.out.println(b.getDailyFortune());
		context.close();

		System.out.println("==========");
		context.refresh();

		BasketballCoach basketBall = context.getBean("setterInjection", BasketballCoach.class);
		System.out.println(basketBall.getEmailId());
		System.out.println(basketBall.getTeam());
		context.close();
	}

}
