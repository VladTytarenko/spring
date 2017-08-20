package test.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import robot.ModelT1000;
import robot.Robot;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("all_context.xml");
		ModelT1000 t1000 = (ModelT1000) context.getBean("t1000");
	}
}
