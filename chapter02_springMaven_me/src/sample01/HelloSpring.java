package sample01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		MessageBean messageBean = (MessageBean) context.getBean("messageBeanImpl");
							//								@autowired안했을 떄 깂
		messageBean.sayHello();//	사과	5000	3						/	사과(생성자에 있는 fruit 값만 나옴)	0	0
		messageBean.sayHello("딸기",20000);//딸기	20000	3				/	딸기	20000	0
		messageBean.sayHello("바나나",3000,10);//	바나나	3000	10		/ 바나나	3000	10
	}

}
