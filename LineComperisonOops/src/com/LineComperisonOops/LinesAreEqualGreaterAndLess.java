package com.LineComperisonOops;

import java.util.Scanner;

class LineAreEqualGreaterAndLess {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("The First Line");
		System.out.print("Enter x1 co-ordinate of First Point: ");
		int x1 = scanner.nextInt();
		System.out.print("Enter y1 co-ordinate of First Point: ");
		int y1 = scanner.nextInt();
		System.out.print("Enter x2 co-ordinate of Second Point: ");
		int x2 = scanner.nextInt();
		System.out.print("Enter y2 co-ordinate of Second Point: ");
		int y2 = scanner.nextInt();

		System.out.println("The Second Line");
		System.out.print("Enter x1 co-ordinate of Third Point: ");
		int p1 = scanner.nextInt();
		System.out.print("Enter y1 co-ordinate of Third Point: ");
		int q1 = scanner.nextInt();
		System.out.print("Enter x2 co-ordinate of Forth point: ");
		int p2 = scanner.nextInt();
		System.out.print("Enter y2 co-ordinate of Forth Point: ");
		int q2 = scanner.nextInt();
		scanner.close();

		Double lengthOfLine1 = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
		Double lengthOfLine2 = Math.sqrt(Math.pow(p2-p1, 2) + Math.pow(q2-q1, 2));
		
		int result = lengthOfLine1.compareTo(lengthOfLine2);
		if(result > 0)
			System.out.println("Length of First End Points is Greater than Length of Second End Points");
		else if(result < 0)
			System.out.println("Length of First End Points is Less than Length of Second End Points");
		else
			System.out.println("Both lines are Equal");
	}
}