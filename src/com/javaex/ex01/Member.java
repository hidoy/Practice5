package com.javaex.ex01;

public class Member {
	 private String id=new String();
	 private String name=new String();
	 private int point;
	 public void setName(String theName) {
		 name=theName;
	 } 
	 public String getName() {
		 return name;
	 }
	 public void setPoint(int thePoint) {
		 point=thePoint;
	 } 
	 public int getPoint() {
		 return point;
	 }
	 public void setId(String theId) {
		 id=theId;
	 } 
	 public String getId() {
		 return id;
	 }
	 public void showInfo() {
		 System.out.printf("회원정보: %s(%s), %d",name,id,point);
	 }
}
