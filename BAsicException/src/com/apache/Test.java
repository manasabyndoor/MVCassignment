//factorial
package com.apache;

import java.util.Scanner;

public class Test {
	public static void main(String args[]) {
		Factorial fact = new Factorial();
		int answer;
		//exception handling
		try {

		//read value from user
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter number");
			int num = scanner.nextInt();
			answer = fact.getFactorial(num);
			System.out.println(answer);

		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
}
