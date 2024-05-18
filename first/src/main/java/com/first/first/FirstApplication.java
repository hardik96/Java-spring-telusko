package com.first.first;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class FirstApplication {

	public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		Alien obj1 = (Alien)context.getBean(Alien.class);
		obj1.code();
		// obj1.setAge(18);
		System.out.println(obj1.getAge());

		Alien obj2 = (Alien)context.getBean(Alien.class);
		System.out.println(obj2.getAge());

		
}

}
