package com.javaex.ex09;

public class StringUtil {
    
    public static String concatString(String...values){
    	String s1=new String();
    	for(int i=0;i<values.length;i++) {
    		s1=s1+values[i];
    	}
        //메소드 내용작성
        return s1;
    }
}
