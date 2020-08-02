package doItAlgolithm._1장;

import java.util.Scanner;

public class Chapter01_Q09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두 수 사이의 합을 구합니다.");
		System.out.print("a의 값 => "); int a = sc.nextInt();
		System.out.print("b의 값 => "); int b = sc.nextInt();
		
		int result = sumof(a, b);
		
		System.out.println("두 수 사이의 합은 "+result+"입니다.");
		
		sc.close();
		
	}
	
	static int sumof(int a, int b) {
		int sum = 0;
		
		int max = a >= b ? a : b;
		int min = a < b ? a : b;
//		System.out.println("max : "+max);
//		System.out.println("min : "+min);
		
		for (int i = min; i <= max; i++) {
			 sum += i;
		}
		
		return sum;
	}
	
}
