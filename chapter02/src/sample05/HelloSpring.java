package sample05;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		SungJuk sungJuk;
		Scanner scan = new Scanner(System.in);
		
			while(true) {
			
			System.out.println("****메뉴******");
			System.out.println("1번");
			System.out.println("2번");
			System.out.println("3번");
			System.out.println("4번");
			System.out.println("5번");
			System.out.println("번호 선택");
			int i = scan.nextInt();
	
			if(i==5) {
			System.out.println("종료");
			break;
		}else if(i==1) {
			sungJuk=(SungJuk)context.getBean("sungJukInput");
			sungJuk.execute();
			
		}else if(i==2) {
			sungJuk=(SungJuk)context.getBean("sungJukOutput");
			sungJuk.execute();
			
		}else if(i==3) {
			sungJuk=(SungJuk)context.getBean("sungJukModify");
			sungJuk.execute();
			
		}else if(i==4){
			sungJuk=(SungJuk)context.getBean("sungJukDelete");
			sungJuk.execute();
		}
			
		}//while
	
	
		
	

	}
	
}
