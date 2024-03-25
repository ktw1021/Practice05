package com.javaex.ex09;

import java.util.Scanner;

public class StringUtilApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열을 입력하시오.");
		System.out.println("(종료를 원하는 경우, \"종료\"를 입력할 것.)");
		
		String strArray[] = new String[5];
		StringUtil strs = new StringUtil();
		
		for (int i=0; i<5;i++) {
			strs.setStrs(sc.next());
			strArray[i]=strs.getStrs();
		}
		
		for (int j = 0; j<5;j++) {
			System.out.print(strArray[j]);
		}
			
		
		
	}

}
