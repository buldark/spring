package sample04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Calc calc;
		calc = (Calc)context.getBean("calcAdd");
		calc.calculate(25, 36);
		
		System.out.println();
		
		calc = context.getBean("calcMul",Calc.class);
		calc.calculate(25, 36);
	}

}
