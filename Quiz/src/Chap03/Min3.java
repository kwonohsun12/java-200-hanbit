package Chap03;

import java.util.Scanner;

public class Min3 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수 a : "); int a = stdIn.nextInt();
		System.out.print("정수 b : "); int b = stdIn.nextInt();
		System.out.print("정수 c : "); int c = stdIn.nextInt();

		
		int min = a;
		System.out.println("min1" + min);
		if (b < min) min = b;
		System.out.println("min2" + min);
		if (c < min) min = c;
		System.out.println("min3" + min);
	}
}
