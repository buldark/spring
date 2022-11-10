package sample05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SungJukInput implements SungJuk {
	private SungJukDTO2 sungJukDTO2 =null;
	
	public SungJukInput(SungJukDTO2 sungJukDTO2) {
		super();
		this.sungJukDTO2 = sungJukDTO2;
	}
	Scanner scan = new Scanner(System.in);
	List<SungJukDTO2> list = new ArrayList<SungJukDTO2>();
	@Override
	public void execute() {
		Scanner scan = new Scanner(System.in);
		System.out.println("이름 입력");
		sungJukDTO2.setName(scan.next());
		System.out.println("국어");
		sungJukDTO2.setKor(scan.nextInt());
		System.out.println("영어");
		sungJukDTO2.setEng(scan.nextInt());
		System.out.println("수학");
		sungJukDTO2.setMath(scan.nextInt());
		
		list.add(sungJukDTO2);
		
		/*
		 * sungJukDTO2.setTot(sungJukDTO2.getKor()+sungJukDTO2.getEng()+sungJukDTO2.
		 * getMath()); sungJukDTO2.setAvg(sungJukDTO2.getTot()/3.0);
		 */		
		for(SungJukDTO2 sungJukDTO2 : list) { System.out.println(sungJukDTO2);}
		
		
	}

}
