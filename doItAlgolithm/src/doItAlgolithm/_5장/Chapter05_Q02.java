package doItAlgolithm._5장;

import java.util.Scanner;

class Chapter05_Q02 {

	// 두수 중 큰수, 작은수를 구분함
	// 나머지가 0이 될때까지 나눔
	// 나머지가 0이 되는순간 큰수가 최대 공약수
	// 처음 입력 받은 두수의 곱 / 최대 공약수 = 최소 공배수
	static int gcd(int x, int y) {
		int max = Math.max(x, y);
		int min = Math.min(x, y);

		int r = 1;
		while (r > 0) {
			r = max % min;
			max = min;
			min = r;
		}

		return max;

	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("두 정수의 최대공약수, 최소공배수를 구합니다.");

		System.out.print("정수를 입력하세요：");
		int x = stdIn.nextInt();
		System.out.print("정수를 입력하세요：");
		int y = stdIn.nextInt();

		System.out.println("최대공약수는 " + gcd(x, y) + "입니다.");
		System.out.println("최소공배수는 " + (x * y) / gcd(x, y) + "입니다.");
		stdIn.close();

	}
}