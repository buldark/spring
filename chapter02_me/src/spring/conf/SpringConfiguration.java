package spring.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import sample01.MessageBeanImpl;

//applicationContext.xml역활을 하는 자바 파일임 즉, 빈을 (생성)만들어주는 자바 파일
//환경설정의미 (일반 자바 파일이 아님을 알려주는 @)
@Configuration 
public class SpringConfiguration {
	
	@Bean
	public MessageBeanImpl messageBeanImpl(){
		return new MessageBeanImpl("사과");
	}
}
/*
 빈으로 생성하는 방법
1. @component

2.  @Bean - 메소드 위에 쓴다
- return 되는 클래스를 빈으로 생성한다.
- 메소드의 이름은 반드시 id명으로 잡아야 한다

@Bean
메소드(){
	return new MessageBeanImpl("사과");
} 
@Bean
퍼블릭 클랙스이름 id명(){
	return new MessageBeanImpl("사과");
} 
 
 
 
 */
 