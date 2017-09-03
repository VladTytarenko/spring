package test.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import interfaces.Robot;
import interfaces.RobotConveyor;
import pool.T1000Pool;
import robot.ModelT1000;


public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("all_context.xml");
		
		T1000Pool pool = (T1000Pool) context.getBean("t1000Pool");
		pool.action();
		
		/*RobotConveyor t1000Conveyor = (RobotConveyor) context.getBean("t1000Conveyor");
		
		Robot terminator1 = t1000Conveyor.createRobot();
		Robot terminator2 = t1000Conveyor.createRobot();
		Robot terminator3 = t1000Conveyor.createRobot();
		
		System.out.println("terminator1 " + terminator1);
		System.out.println("terminator2 " + terminator2);
		System.out.println("terminator3 " + terminator3);*/
	}
}
