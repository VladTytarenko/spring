package robot;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;

import interfaces.Hand;
import interfaces.Head;
import interfaces.Leg;

public class Robot implements InitializingBean, DisposableBean {
	
	private Head head;
	private Hand hand;
	private Leg leg;

	public Robot(Head head, Hand hand, Leg leg) {
		super();
		this.head = head;
		this.hand = hand;
		this.leg = leg;
	}
	
	public void action() {
		head.think();
		hand.catchSomething();
		leg.go();
	}

	public void destroy() throws Exception {
		System.out.println(this + " - method destroy()");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println(this + " - method init()");		
	}

}
