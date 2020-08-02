package doItAlgolithm._1장;

import java.util.Scanner;

public class Chapter01_Q01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("네 정수 중 최댓값을 구합니다.");
		System.out.print("a값을 입력하세요 => ");
		int a = sc.nextInt();
		System.out.print("b값을 입력하세요 => ");
		int b = sc.nextInt();
		System.out.print("c값을 입력하세요 => ");
		int c = sc.nextInt();
		System.out.print("d값을 입력하세요 => ");
		int d = sc.nextInt();
		
		int max = max4(a, b, c, d);
		
		System.out.println("최대값은 "+max+"입니다.");
		
		sc.close();
	}
	
	
	static int max4(int a, int b, int c, int d) {
		int max = a;
		
		if(b > max) max = b;
		if(c > max) max = c;
		if(d > max) max = d;
		
		return max;
	}
	

}
