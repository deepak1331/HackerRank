package com.hackerRank.Day1;

import java.util.Scanner;

public class PrintTest {
	public static void main(String[] args) {
		int i = 4;
		double d = 4.0;
		String s = "HackerRank ";
		Scanner scan = new Scanner(System.in);
		/* Declare second integer, double, and String variables. */
		int j;
		double e;
		String t = null;
		/* Read and save an integer, double, and String to your variables. */
		j = scan.nextInt();
		e = scan.nextDouble();
		scan.nextLine();
		t = scan.nextLine();
		System.out.println(t);

		/* Print the sum of both integer variables on a new line. */
		System.out.println(i + j);
		/* Print the sum of the double variables on a new line. */
		System.out.println(d + e);
		/*
		 * Concatenate and print the String variables on a new line; the 's' variable
		 * above should be printed first.
		 */
		System.out.println(s + t);
		scan.close();
	}

}
