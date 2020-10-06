package com.itwill.member;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class MemberControllerTest {

	public static void main(String[] args){
		// 컨트롤러 역할
		// SelectMemberAction 객체 생성 -> 동작실행
		System.out.println("컨트롤러 실행 -> 주소매핑");
		// 의존관계
		//Action action = new SelectMemberAction();
		
		// 의존 주입(DI)
		System.out.println("C : 외부 설정파일을 읽어오기-spring");
		BeanFactory fac = new XmlBeanFactory(new FileSystemResource("member.xml"));
		
		System.out.println("C : 외부 설정파일을 사용해서 생성된 객체 주입(DI)");	
		//SelectMemberAction action = (SelectMemberAction) fac.getBean("action"); (O)
		Action action = (SelectMemberAction) fac.getBean("action"); // (O)
		
		
		try {
			action.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("C : 페이지 이동(Redirect/Forward)");
		
	}
	
	
	
}
