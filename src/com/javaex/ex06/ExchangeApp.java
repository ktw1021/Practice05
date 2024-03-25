package com.javaex.ex06;

import java.util.Scanner;

public class ExchangeApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int exit = 0;
		
		do {
		System.out.println("어떻게 환전하겠습니까?");
		System.out.println("1.원->달러\t 2.달러->원 \t 3.종료");
		int select = sc.nextInt();
		
		if (select==1) {
			System.out.print("1.원: \n");
			int won = sc.nextInt();
			Exchange.WonToDollor(won);
		}
		
		else if (select==2) {
			System.out.print("2.달러: \n");
			double dolor = sc.nextDouble();
			Exchange.DollorToWon(dolor);
		}
		
		else if (select==3) {
			exit=1;
			System.out.println("3.프로그램을 종료합니다.");
		}
		
		else {
			System.out.println("1, 2, 3 외에 다른 숫자를 입력하셨습니다.\n");
		}
		
		} while(exit==0);
		sc.close();
	}
}
