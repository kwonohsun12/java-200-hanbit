package Chap02;
//키보드에서 입력한 정수값을 +5 또는 -5범위의 랜덤 정수값을 생성하자.

import java.util.Random;
import java.util.Scanner;

class RandomPlusMinus5 {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수값");
		int x = stdIn.nextInt();		// x에 정수값을 대입
		
		System.out.println("입력 값의 ±5범위의 난수를 생성했습니다.");
		System.out.println("값은 " + (x-5 + rand.nextInt(11)) + "입니다.");
	}
}
