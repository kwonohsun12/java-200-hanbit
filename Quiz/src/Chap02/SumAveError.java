package Chap02;

public class SumAveError {
	public static void main(String[] args) {

		int x, y, z;
		int sum;
		
		x = 63;
		y = 18;
		z = 20;
		sum = x + y + z;
		
		
		System.out.println("x값" + x + "입니다.");
		System.out.println("y값" + y + "입니다.");
		System.out.println("z값" + z + "입니다.");
		System.out.println("총합은" + (x + y + z) + "입니다.");
		System.out.println("평균은" + (x + y + z)/3 + "입니다.");
		System.out.println("sum은" + sum + "입니다.");
	}
}
