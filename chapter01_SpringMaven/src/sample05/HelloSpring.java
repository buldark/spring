package sample05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		SungJuk sungjuk;
		
		
		sungjuk= (SungJuk)context.getBean("sungJukImpl"); //부모 =  자식
		sungjuk.calc();
		sungjuk.display();
		

	}

}
