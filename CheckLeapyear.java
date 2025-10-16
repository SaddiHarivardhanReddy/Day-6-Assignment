package com.codegnan.operatorexamples;

import java.util.Scanner;

public class CheckLeapyear {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Year");
		int year=s.nextInt();
		String result=(year%4==0 && (year%100!=0 || year%400==0))?"It is a leap year":"It is not leap year";
		System.out.println(result);
		s.close();
	}

}
