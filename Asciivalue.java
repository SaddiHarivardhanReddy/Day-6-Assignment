package com.codegnan.operatorexamples;

import java.util.Scanner;

public class Asciivalue {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a character(alphabet/digit/special character):");
		char alpha=s.next().charAt(0);
		int ascii=(int)alpha;
		System.out.println(+ascii);
		s.close();
		
	}

}
