package com.javaex.ex01;

public class MemberApp {

	public static void main(String[] args) {
		Member a = new Member();
		Member b = new Member();
		Member c = new Member();
		a.setName("정우성");
		a.setId("jws");
		a.setPoint(50000);
		b.setName("유재석");
		b.setId("yjs");
		b.setPoint(30000);
		c.setName("이효리");
		c.setId("lhr");
		c.setPoint(40000);
		a.showInfo();
		b.showInfo();
		c.showInfo();
	}

}
