package com.LineComperisonOops;

import java.util.Scanner;

class CopmareToMethod{
	private void lengthOfLines(int x1, int y1, int x2, int y2, int p1, int q1, int p2, int q2) {
        Double lengthOfLine1 = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        Double lengthOfLine2 = Math.sqrt((p2-p1)*(p2-p1)+(q2-q1)*(q2-q1));
        System.out.printf("Length of First End Points are : %.2f %n", lengthOfLine1);
        System.out.printf("Length of Second End Points are : %.2f %n", lengthOfLine2);
        equal(lengthOfLine1, lengthOfLine2);
        compare(lengthOfLine1, lengthOfLine2);
    }

    
    private void equal(Double lengthOfLine1, Double lengthOfLine2) {
        boolean ans = lengthOfLine1.equals(lengthOfLine2);
        if(ans)
            System.out.println("Both Lines are Equal.");
        else
            System.out.println("Both Lines are not Equal.");
    }

   
    private void compare(Double lengthOfLine1, Double lengthOfLine2) {
        int res = lengthOfLine1.compareTo(lengthOfLine2);
        if(res > 0)
            System.out.println("Length of First End Points is Greater than Length of Second End Points");
        else if(res < 0)
            System.out.println("Length of First End Points is Less than Length of Second End Points");
        else
            System.out.println("Both Lines are Equal.");
    }

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
		
		CopmareToMethod linecomp = new CopmareToMethod();
		linecomp.lengthOfLines(x1, y1, x2, y2, p1, q1, p2, q2);
	}
}
