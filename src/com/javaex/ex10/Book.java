package com.javaex.ex10;

public class Book {
    int bookNo;
    String title;
    String author;
    int stateCode;
    public Book(int bookNo,String title,String author) {
    	this.bookNo=bookNo;
    	this.title=title;
    	this.author=author;
    	stateCode=1;
    }
    public void setBookNo(int bookNo) {
    	this.bookNo=bookNo;
    }
    public int getBookNo() {
    	return bookNo;
    }
    public void setTitle(String title) {
    	this.title=title;
    }
    public String getTitle() {
    	return title;
    }
    public void setAuthor(String author) {
    	this.author=author;
    }
    public String getAuthor() {
    	return author;
    }
    public void rent() {
    	stateCode=0;
    	System.out.printf("%s(가) 대여 됐습니다%n",title);
    }
    public void print() {
    	System.out.printf("책 제목:%s, 작가:%s, 대여유무: ",title,author);
    	if(stateCode==1) {
    		System.out.println("재고있음");
    	}
    	else {
    		System.out.println("대여중");
    	}
    }
    
    
    
    
}
