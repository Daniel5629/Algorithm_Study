package doItAlgolithm._1장;

import java.util.Scanner;

public class Chapter01_Q15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("1.왼쪽 아래가 직각인 이등변 삼각형 | 2.왼쪽 위가 직각인 이등변 삼각형 | 3.오른쪽 아래가 직각인 이등변 삼각형 | 4.오른쪽 위가 직각인 이등변 삼각형");

		String key = sc.nextLine();

		System.out.print("삼각형 크기 => ");
		int n = sc.nextInt();

		switch (key) {
		case "1":
			trialngleLB(n);
			break;
		case "2":
			trialngleLU(n);
			break;
		case "3":
			trialngleRB(n);
			break;
		case "4":
			trialngleRU(n);
			break;

		default:
			break;
		}

		sc.close();
	}

	// 왼쪽 아래가 직각인 이등변 삼각형을 출력
	static void trialngleLB(int n) {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	// 왼쪽 위가 직각인 이등변 삼각형을 출력
	static void trialngleLU(int n) {

		for (int i = 0; i < n; i++) {
			for (int j = i; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	// 오른쪽 아래가 직각인 이등변 삼각형을 출력
	static void trialngleRB(int n) {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n-i-1; j++) {
				System.out.print(" ");
			}
			
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	// 오른쪽 위가 직각인 이등변 삼각형을 출력
	static void trialngleRU(int n) {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}

			for (int j = i; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
