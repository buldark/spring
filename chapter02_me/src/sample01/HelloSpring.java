package sample01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		MessageBean messagebean = (MessageBean)context.getBean("messageBeanImpl");
		
		messagebean.sayHello();//사과	5000	3
		messagebean.sayHello("딸기",20000);//딸기	20000	3
		messagebean.sayHello("바나나",3000,10);//바나나	3000	10
	}

}
