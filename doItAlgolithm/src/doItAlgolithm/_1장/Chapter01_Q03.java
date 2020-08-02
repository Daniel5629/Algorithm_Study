package doItAlgolithm._1장;

import java.util.Scanner;

public class Chapter01_Q03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("세 정수 중 최소값을 구합니다.");
		System.out.print("a값을 입력하세요 => ");
		int a = sc.nextInt();
		System.out.print("b값을 입력하세요 => ");
		int b = sc.nextInt();
		System.out.print("c값을 입력하세요 => ");
		int c = sc.nextInt();
		System.out.print("d값을 입력하세요 => ");
		int d = sc.nextInt();
		
		int min = min3(a, b, c, d);
		
		System.out.println("최소값은 "+min+"입니다.");
		
		sc.close();
	}
	
	
	static int min3(int a, int b, int c, int d) {
		int min = a;
		
		if(b < min) min = b;
		if(c < min) min = c;
		if(d < min) min = d;
		
		return min;
	}
}
