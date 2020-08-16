package doItAlgolithm._5장;

import java.util.Scanner;

public class Chapter05_Q01 {

	static int factorial(int n) {
		if (n > 0) {
			int result = 1;
			for (int i = 1; i <= n; i++) {
				result *= i;
			}
			return result;
		} else
			return 1;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("정수를 입력하세요.：");
		int x = stdIn.nextInt();

		System.out.println(x + "의 팩토리얼은 " + factorial(x) + "입니다.");
		stdIn.close();
	}
}
