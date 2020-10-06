package com.itwill.spring;

public class SubPerson implements IPerson{
	// 사람의 정보를 저장 + 사람의 기능(sayHello)
	private String name;
	private int age;
	
	/*public String getName() {
		return name;
	}*/
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	@Override
	public void sayHello() { // toString 기능 대신 // sayHello 만들었기 때문에 getName, getAge 없어도 됨
		System.out.println("SayHello : " + name + "," + age);
	}
	
	
	@Override
	public String toString() {
		return "사용자 이름 : "+name+", 나이 : "+age;
	}
	
	
	

}
