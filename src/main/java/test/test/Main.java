package test.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import robot.ModelT1000;
import robot.Robot;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

		Object obj = context.getBean("t1000");
		ModelT1000 t1000 = null;
		
		if (obj instanceof ModelT1000) {

			t1000 = (ModelT1000) obj;
			t1000.action();
			System.out.println(t1000);

		}
		
		/** 	При scope="singleton" повертає один й той самий об'єкт. 
		 *  t1000 і t1001 однакові(навіть за хеш-кодом)
		 *  	При scope="prototype" створює і повертає новий об'єкт при кожному виклику.
		 *  t1000 і t1001 різні
		 */
		ModelT1000 t1001 = (ModelT1000)context.getBean("t1000"); 
		
		System.out.println(t1001);
		
		/** 	Якщо bean з scope="prototype" входить в інший, в якому scope="singleton",
		 *  то він буде вести себе, як "singleton", а як prototype буде себе вести,
		 *  якщо у зовнішнього теж prototype. 
		 *  	Якщо зовнішній bean - "prototype", а внутрішній - "singleton", то внутрішній
		 *  буде вести себе, як "singleton".
		 */
		
		System.out.println(t1000.getHead());
		System.out.println(t1001.getHead());
		
		Robot robot = (Robot)context.getBean("interfacesForLifeLoop");		
	
	}
}
