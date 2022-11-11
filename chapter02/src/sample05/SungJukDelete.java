package sample05;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import lombok.Setter;

public class SungJukDelete implements SungJuk {
	@Setter
	private List<SungJukDTO2> list;
	
	@Override
	public void execute() {
		System.out.println();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("삭제 할 이름 입력 : ");
		String name = scanner.next();
		
		int sw=0;
		Iterator<SungJukDTO2> it = list.iterator();
		while(it.hasNext()) {
			SungJukDTO2 sungJukDTO2 = it.next();
			
			if(sungJukDTO2.getName().equals(name)) {
				sw = 1;
				it.remove();
				System.out.println(name+"님의 데이터를 삭제하였습니다");
			}
		}//while
		
		if(sw == 0) System.out.println("찾고자하는 이름이 없습니다");
	}

}










