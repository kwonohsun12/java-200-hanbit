package Chap02;

import java.util.Scanner;

class LowestDigit {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수값");
		int x = stdIn.nextInt();
		
		System.out.println("마지막 자리수를 제외한 값은" + (x / 10) + "입니다.");
		System.out.println("마지막 자리수는" + (x % 10) + "입니다.");
	}
}
