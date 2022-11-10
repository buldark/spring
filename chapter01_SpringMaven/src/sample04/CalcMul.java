package sample04;

import org.springframework.stereotype.Component;

@Component
public class CalcMul implements Calc {

	@Override
	public void calculate(int x, int y) {
		// TODO Auto-generated method stub
		int result = x * y ;
		System.out.println(x +" * "+y+" = " + result);
	}

}
