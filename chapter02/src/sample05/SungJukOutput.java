package sample05;

import java.util.ArrayList;
import java.util.List;

public class SungJukOutput implements SungJuk {
	
	private SungJukDTO2 sungJukDTO2 =null;
	
	public SungJukOutput() {
		super();
		this.sungJukDTO2 = sungJukDTO2;
	}
	List<SungJukDTO2> list = new ArrayList<SungJukDTO2>();
	
	@Override
	public void execute() {
		System.out.println("이름 \t 국어\t영어\t수학\t총점\t평균");
		for(int i=0 ; i<list.size();i++) {System.out.println(list);
		}
	}

}
