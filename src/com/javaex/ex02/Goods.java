package com.javaex.ex02;

public class Goods {
	private String name;
	private int price;
	public Goods() {}
	public Goods(String theName, int thePrice) {
		name=theName;
		price=thePrice;
	}
	public String getName() {
		return name;
	}
	public void setName(String theName) {
		name=theName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int thePrice) {
		price=thePrice;
	}
	
	public void showInfo() {
		System.out.println("상품명:" + name + ", 가격:" + price);
	}
}




