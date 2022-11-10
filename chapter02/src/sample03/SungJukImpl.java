package sample03;

import java.util.Scanner;

public class SungJukImpl implements SungJuk {
	
	private SungJukDTO sungJukDTO =null;
	
	public SungJukImpl(SungJukDTO sungJukDTO) {
		super();
		this.sungJukDTO = sungJukDTO;
	}

	@Override
	public void calcTot() {
		sungJukDTO.setTot(sungJukDTO.getKor()+sungJukDTO.getEng()+sungJukDTO.getMath());

	}

	@Override
	public void calcAvg() {
		sungJukDTO.setAvg(sungJukDTO.getTot()/3.0);
		
	}

	@Override
	public void display() {
		System.out.println("이름 \t 국어\t영어\t수학\t총점\t평균");
		System.out.println(sungJukDTO);//tostring떄문에!! 
	}

	@Override
	public void modify() {
		Scanner scan = new Scanner(System.in);
		System.out.println("이름 입력");
		sungJukDTO.setName(scan.next());
		System.out.println("국어");
		sungJukDTO.setKor(scan.nextInt());
		System.out.println("영어");
		sungJukDTO.setEng(scan.nextInt());
		System.out.println("수학");
		sungJukDTO.setMath(scan.nextInt());
		
	}

}
