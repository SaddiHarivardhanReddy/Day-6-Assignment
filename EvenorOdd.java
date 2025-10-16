package com.codegnan.operatorexamples;
import java.util.*;

public class EvenorOdd {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int num=s.nextInt();
		String result=(num%2==0)?"number is even":"number is odd";
		System.out.println(result);
		s.close();
	}

}
