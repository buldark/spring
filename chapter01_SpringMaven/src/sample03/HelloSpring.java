package sample03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class HelloSpring {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");//빈 생성을 어노테이션으로 ㅎ
		
		MessageBean messageBean =(MessageBean)context.getBean("messageBean");//(MessageBean)-cast:강제 형변환 
		messageBean.sayHello("spring");
		System.out.println();
		
		MessageBean messageBean2 =context.getBean("messageBean",MessageBean.class);//(MessageBean)-cast:강제 형변환 
		messageBean2.sayHello("spring");
		System.out.println();
	}

}
