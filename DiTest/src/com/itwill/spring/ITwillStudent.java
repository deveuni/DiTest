package com.itwill.spring;

public class ITwillStudent implements Student{
	
	private String name;
	private int classRoom;
	
	public ITwillStudent(){}
	public ITwillStudent(String name){
		this.name = name;
	}
	public ITwillStudent(String name, int classRoom){
		this.name = name;
		this.classRoom = classRoom;
	}
	
	
	
	// set() 사용해서 정보 주입
	public void setName(String name) {
		this.name = name;
	}
	public void setClassRoom(int classRoom) {
		this.classRoom = classRoom;
	}
	
	
	
	
	@Override
	public void sayHello() {
		System.out.println("안녕하세요! "+classRoom+"강의장, "+name+"입니다.");
		
	}
	
	
	
	

}
