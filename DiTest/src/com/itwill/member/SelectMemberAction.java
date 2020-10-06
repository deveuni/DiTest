package com.itwill.member;



public class SelectMemberAction implements Action {
	
	// xml파일에서 bean 객체를 따로 만들던 것을 Controller에서 외부파일 SelectAction을 불러와서 
	// SelectAction에서 set메서드를 이용해서 의존주입을 하면됨. 
	// bean끼리의 주입을 사용하면 여러번 불러오는 코드를 한번만 불러오면 되기 때문
	private MemberDAO mdao;
	
	public void setMdao(MemberDAO mdao) {
		this.mdao = mdao;
		System.out.println("M :xml 파일을 사용한 주입(setter)");
	}


	@Override
	public void execute() throws Exception {
		// Action 인터페이스를 구현 - 다형성 사용 
		System.out.println("M : SelectMemberAction_execute() 호출");
		
		// 파라미터, 세션, 아이디 체크
		// DB접근 -> DAO객체 생성 - getMemberList()
		System.out.println("M : MemberDAO 생성");
		
		// 의존관계
		//MemberDAO mdao = new MemberDAOImpl();
		/*System.out.println("M : 외부 설정파일을 읽어오기-spring");
		BeanFactory fac = new XmlBeanFactory(new FileSystemResource("member.xml"));
		*/
		// 의존 주입
		/*System.out.println("M : 외부 설정파일을 사용해서 생성된 객체(DAO) 주입(DI)");
		MemberDAO mdao = (MemberDAOImpl) fac.getBean("mdao");*/
		
		mdao.getMemberList();
		
		System.out.println("M :정보(LIST) 저장");
		System.out.println("M : 페이지 이동(view)");
		
		
	}

}
