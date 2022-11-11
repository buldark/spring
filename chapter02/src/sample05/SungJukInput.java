package sample05;

import java.util.List;
import java.util.Scanner;

import lombok.Setter;

public class SungJukInput implements SungJuk {
	@Setter
	private SungJukDTO2 sungJukDTO2 = null;
	@Setter
	private List<SungJukDTO2> list;
	
//	public void setSungJukDTO2(SungJukDTO2 sungJukDTO2) {
//		this.sungJukDTO2 = sungJukDTO2;
//	}
//
//	public void setList(List<SungJukDTO2> list) {
//		this.list = list;
//	}

	@Override
	public void execute() {
		System.out.println();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("이름 입력 : ");
		String name = scanner.next();
		System.out.print("국어 입력 : ");
		int kor = scanner.nextInt();
		System.out.print("영어 입력 : ");
		int eng = scanner.nextInt();
		System.out.print("수학 입력 : ");
		int math = scanner.nextInt();
		System.out.println();
		
		int tot = kor + eng + math;
		double avg = (double)tot / 3;
		
		sungJukDTO2.setName(name);
		sungJukDTO2.setKor(kor);
		sungJukDTO2.setEng(eng);
		sungJukDTO2.setMath(math);
		sungJukDTO2.setTot(tot);
		sungJukDTO2.setAvg(avg);
		
		list.add(sungJukDTO2);
		System.out.println(list);
		
		//응답
		System.out.println(name+"님의 데이터를 입력하였습니다");
	}

}


















