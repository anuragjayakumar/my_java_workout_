package com.java.practice;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" enter first_Number : ");
		int no_1 = sc.nextInt();
		
		System.out.println(" enter secound_Number : ");
		int no_2 = sc.nextInt();
		
		System.out.println(" enter required operation[ +,-,/,*]:");
		char operator = sc.next().charAt(0);
		
		if(operator== '+'||operator== '-'||operator== '*'||operator== '/') {
		 int res =  calculator(no_1 , no_2 , operator);
		 System.out.println(no_1+" "+operator+" "+no_2+ " = " + res);
		}
		else {
			System.err.println("invalid operators... please try for [+,-,*,/]");
		}
		sc.close();
		
		
	}
	static int calculator(int x, int y , char operator) {
		int res = 0;
		switch (operator) {
		case '+':
			res = x+y;
			break;
		case '-':
			res = x-y;
			break;
		case '*':
			res = x*y;
			break;
		case '/':
			res = x/y;
			break;
		

		
		}
		return res;
	
		
	}

}
