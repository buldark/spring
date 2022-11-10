package sample05;

import java.util.Scanner;

public class SungJukImpl implements SungJuk {
	private String name;
	private int kor,eng,math;
	private double avg;
	private int tot;
	public SungJukImpl(){
		Scanner scan = new Scanner(System.in);
		System.out.print("이름");
		name= scan.next();
		System.out.print("국어");
		kor =scan.nextInt();
		System.out.print("영어");
		eng =scan.nextInt();
		System.out.print("수학");
		math =scan.nextInt();
		
	}
	@Override
	public void calc() {
		tot = kor + eng + math;
		avg = tot/3.0;

	}

	@Override
	public void display() {
	 System.out.println("이름 \t 국어\t영어\t수학\t총점\t평균");
	 System.out.println(name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+tot+"\t"+String.format("%.3f", avg));

	}

}
