package com.LineComperisonOops;

import java.util.Scanner;

class EqualityOfTwoLine {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("The First Line");
		System.out.print("Enter x1 co-ordinate of First Point: ");
		int P1 = scanner.nextInt();
		System.out.print("Enter y1 co-ordinate of First Point: ");
		int P = scanner.nextInt();
		System.out.print("Enter x2 co-ordinate of Second Point: ");
		int Q2 = scanner.nextInt();
		System.out.print("Enter y2 co-ordinate of Second Point: ");
		int Q = scanner.nextInt();

		System.out.println("The Second Line");
		System.out.print("Enter x1 co-ordinate of Third Point: ");
		int A1 = scanner.nextInt();
		System.out.print("Enter y1 co-ordinate of Third Point: ");
		int A = scanner.nextInt();
		System.out.print("Enter x2 co-ordinate of Forth point: ");
		int B2 = scanner.nextInt();
		System.out.print("Enter y2 co-ordinate of Forth Point: ");
		int B = scanner.nextInt();
		scanner.close();

		Double lengthOfLine1 = Math.sqrt(Math.pow(Q2-P1, 2) + Math.pow(Q-P, 2));
		Double lengthOfLine2 = Math.sqrt(Math.pow(B2-A1, 2) + Math.pow(B-A, 2));
		
		System.out.printf("length of First Line : %.2f %n", lengthOfLine1);
		System.out.printf("length of Second Line : %.2f %n", lengthOfLine2);
		boolean ans = lengthOfLine1.equals(lengthOfLine2);
		if(ans)
			System.out.println("Both Lines are Equal");
		else
			System.out.println("Both Lines are not Equal");
	}
}