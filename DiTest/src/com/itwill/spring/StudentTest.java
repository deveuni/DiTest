package com.itwill.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class StudentTest {

	public static void main(String[] args) {
		// 학생-아이티윌학생 객체 (약한결합)
		// Student(I) - ItwillStudent(C)
		// student.xml(스프링 역할)
				
		// "이름:홍길동,강의장:7" 정보 확인
		// setter 사용 객체 주입
		// Spring 사용 - 객체 주입(DI)
		
		// 외부 파일을 읽어오기
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("student.xml"));
		
		// 외부 정보를 사용해서 생성된 객체를 주입
		Student IS = (Student) factory.getBean("studentBean");
		// 인터페이스 안에 추상메서드 왜 실행되냐? 상속관계에서는 메소드 오버라이딩된 메소드를 호출하기 때문에 - 인터페이스이지만 서브클래스가 구현을 했으므로 서브클래스에서 오버라이딩된 메소드가 호출됨.
		ITwillStudent user = (ITwillStudent)factory.getBean("studentBean");
		
		IS.sayHello();
		System.out.println("---------------------------------------------------");
		
		////////////////////////////////////////////////////////////////////
		// 자바 - 객체 구현/사용
		//Student Kim = new ITwillStudent(); (X) //업캐스팅 - 상속 받은 부분만 사용 가능 (인터페이스 안에 있는 부분만 가능한데 인터페이스 안에 set메서드가 없으므로)
		ITwillStudent Kim = new ITwillStudent();
		Kim.setName("김학생");
		Kim.setClassRoom(7);
		Kim.sayHello();
		
		
		System.out.println("---------------------------------------------------");
		System.out.println("생성자 사용해서 객체 생성");
		// 생성자를 사용한 객체 생성 
		ITwillStudent user2 = new ITwillStudent("사용자2");
		user2.sayHello();
		Student user3 = new ITwillStudent("사용자3",3);
		user3.sayHello();
		
		
		// 생성자를 사용한 주입
		System.out.println("---------------------------------------------------");
		System.out.println("생성자 사용해서 객체 주입 - DI");
		
		// student.xml 파일에서 객체 생성 완료 
		
		ITwillStudent user4 = (ITwillStudent)factory.getBean("conBean1");
		user4.sayHello();
		
		// 객체 생성 [사용자2(생성자), 1강의장] - spring
		// 생성된 객체 주입 (DI)
		ITwillStudent user5 = (ITwillStudent)factory.getBean("conBean2");
		user5.sayHello();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				

	}

}
