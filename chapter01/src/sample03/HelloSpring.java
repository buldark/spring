package sample03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class HelloSpring {

	public static void main(String[] args) {
		//ApplicationContext context = new FileSystemXmlApplicationContext("src/applicationContext.xml"); 
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");//위에것보다 이것을 더 선호함
		
		MessageBean messageBean =(MessageBean)context.getBean("messageBean");//(MessageBean)-cast:강제 형변환 
		messageBean.sayHello("spring");
		System.out.println();
		
		MessageBean messageBean2 =context.getBean("messageBean",MessageBean.class);//(MessageBean)-cast:강제 형변환 
		messageBean2.sayHello("spring");
		System.out.println();
	}

}
