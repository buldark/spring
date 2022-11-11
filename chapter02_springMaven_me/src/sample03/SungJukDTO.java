package sample03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component//class bean을 생성 하기 위한 annotaion
public class SungJukDTO {

	private int kor,eng,math,tot;
	private String name;
	private double avg;
	
		

	public int getKor() {
		return kor;
	}


	@Autowired
	public void setKor(@Value("97") int kor) {
		this.kor = kor;
	}



	public int getEng() {
		return eng;
	}


	@Autowired
	public void setEng(@Value("100") int eng) {
		this.eng = eng;
	}


	
	public int getMath() {
		return math;
	}


	@Autowired
	public void setMath(@Value("95") int math) {
		this.math = math;
	}


	public int getTot() {
		return tot;
	}


	
	public void setTot(int tot) {
		this.tot = tot;
	}


	
	public String getName() {
		return name;
	}


	@Autowired
	public void setName(@Value("홍길동") String name) {
		this.name = name;
	}


	
	public double getAvg() {
		return avg;
	}


	
	public void setAvg(double avg) {
		this.avg = avg;
	}



	@Override
	public String toString() {
		return name +"\t"
				+kor +"\t"
				+eng +"\t"
				+math +"\t"
				+tot +"\t"
				+String.format("%.2f", avg);
	}
	
	
}
