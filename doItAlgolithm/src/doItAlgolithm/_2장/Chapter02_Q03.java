package doItAlgolithm._2장;

import java.util.Scanner;

public class Chapter02_Q03 {

	static int sumOf(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("요솟수 => ");
		int num = sc.nextInt();

		int[] arr = new int[num];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("arr[" + i + "] : ");
			arr[i] = sc.nextInt();
		}

		System.out.println("요소의 합계는 "+sumOf(arr)+"입니다.");

		sc.close();

	}
}
