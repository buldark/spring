package sample01;

public class HelloSpring {

	public static void main(String[] args) {
		MessageBean messageBean = new MessageBean();//객체 생성 - 객체 생성 떄 생성자가 꼭 호출 된다. 
		messageBean.sayHello("Spring");

	}

}
