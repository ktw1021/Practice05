package com.javaex.ex06;

public class Exchange {
	
	public static void WonToDollor(double won) {
		if (won<0) {
			won=0;
		}
		System.out.printf("%,.1f원은 %,.1f달러입니다.%n",won,won*=0.00074);
		
	}
	
	public static void DollorToWon(double dolr) {
		if (dolr<0) {
			dolr=0;
		}
		System.out.printf("%,.1f달러는 %,.1f원입니다.%n",dolr,dolr*=1340);
		
	}
	
}
