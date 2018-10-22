package com.hackerRank.Day3;

import java.util.Scanner;

public class Solution {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int N = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		String msg = null;
		if (N >= 1 && N <= 100) {
			if (N % 2 != 0)
				msg = "Weird";
			else if (N % 2 == 0) {
				if ((N >= 2 && N <= 5) || N > 20)
					msg = "Not Weird";
				else if (N >= 6 && N <= 20)
					msg = "Weird";
			}
		}
		System.out.println(msg);
		scanner.close();
	}
}
