package com.codegnan.operatorexamples;

import java.util.Scanner;

public class PositiveorNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a number");
		Scanner s=new Scanner(System.in);
		int number=s.nextInt();
		if(number==0) {
			System.out.println("0 is neither positive nor negative");
		}
		else{
		String result=(number<=-1)?"number is negative":"number is positive";
		System.out.println(result);
		}
		s.close();
	}

}
