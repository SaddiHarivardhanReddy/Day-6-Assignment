package com.codegnan.operatorexamples;

import java.util.Scanner;

public class Divisiblebyfive {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enetr a number");
		int num=s.nextInt();
		String result=(num%5==0)?"number is divisible by 5":"number is not divisible by 5";
		System.out.println(result);
		s.close();
		
	}

}
