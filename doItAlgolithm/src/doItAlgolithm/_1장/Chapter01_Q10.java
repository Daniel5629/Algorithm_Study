package doItAlgolithm._1장;

import java.util.Scanner;

public class Chapter01_Q10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b = 0;
		
		System.out.print("a의 값 => ");
		a = sc.nextInt();

		do {
			if (b != 0 && a > b) System.out.println("a보다 큰값을 입력하세요!");
			
			System.out.print("b의 값 => ");
			
			b = sc.nextInt();

		} while (a > b);

		System.out.println("b - a는 " + (b - a) + "입니다.");

		sc.close();

	}

}
