package Chap03;

import java.util.Scanner;

class Address {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("주소:");
		String address = stdIn.nextLine(); //주소
		
		System.out.print("주소는 " + address + "입니다.");
	}


}
