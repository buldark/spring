package sample02;

public class HelloSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//MessageBeanKo messageBeanKo = new MessageBeanKo();//1대1관계 결합도 100%
			MessageBean messageBean = new MessageBeanKo();//결합도 낮추기, 다형성(부모 = 자식)
			messageBean.sayHello(" spring");
			
			MessageBean messagebean = new MessageBeanEn();//결합도 낮추기, 다형성(부모 = 자식)
			messagebean.sayHello(" spring");
	}

}
