package com.spring.learning;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifecycleDemo {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

		Coach singleTonA = context.getBean("singleTonTesting", Coach.class);

		Coach singleTonB = context.getBean("singleTonTesting", Coach.class);

		Boolean sameMemLocation = (singleTonA == singleTonB);

		System.out.println("Diff mem location=>" + sameMemLocation);

		System.out.println("singleTonA=>" + singleTonA);
		System.out.println("singleTonB=>" + singleTonB);

		context.close();

		context.refresh();

		Coach prototypeA = context.getBean("prototypeTesting", Coach.class);

		Coach prototypeB = context.getBean("prototypeTesting", Coach.class);

		Boolean diffMemLocation = (prototypeA != prototypeB);

		System.out.println("Diff mem location=>" + diffMemLocation);

		System.out.println("prototypeA=>" + prototypeA);
		System.out.println("prototypeB=>" + prototypeB);

		context.close();

	}

}
