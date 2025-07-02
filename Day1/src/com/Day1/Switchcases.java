package com.Day1;
import java.util.Scanner;

public class Switchcases {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter first number:");
		int a = sc.nextInt();
		
		System.out.println("Enter secomnd number");
		int b = sc.nextInt();
		
		System.out.println("Enetr the operation to be performed +,-,*");
		char c= sc.next().charAt(0);
		
		switch(c){
			case '+':
				System.out.println("result is " + (a+b));
				break;
				
			case '-':
				System.out.println("result is " + (a-b));
				break;
				
			case '*':
				System.out.println("result is " + (a*b));
				break;
			
			default:
				System.out.println("invalid oprerator");
				
		}
		sc.close();
	}

}
