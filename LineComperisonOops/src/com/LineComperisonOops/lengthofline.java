package com.LineComperisonOops;

import java.util.Scanner;

class lengthofline {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter x co-ordinate of First Point: ");
		int x1 = scanner.nextInt();
		System.out.print("Enter y co-ordinate of First Point: ");
		int y1 = scanner.nextInt();
		System.out.print("Enter x co-ordinate of Second Point: ");
		int x2 = scanner.nextInt();
		System.out.print("Enter y co-ordinate of Second Point: ");
		int y2 = scanner.nextInt();
		scanner.close();

		double lenghtOfLine = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		System.out.printf("Length of End Point is : %.2f %n", lenghtOfLine);
	}
}