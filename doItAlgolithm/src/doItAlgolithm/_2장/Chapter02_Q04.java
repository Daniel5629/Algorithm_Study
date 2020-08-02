package doItAlgolithm._2장;

import java.util.Scanner;

import doItAlgolithm.util.ArrayUtil;

public class Chapter02_Q04 {

	static int[] copy(int[] arr1, int[] arr2) {
		return arr1 = arr2.clone();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("arr2 요솟수 => ");
		int num = sc.nextInt();

		int[] arr1 = {0,0,0};

		int[] arr2 = new int[num];

		for (int i = 0; i < arr2.length; i++) {
			System.out.print("arr2[" + i + "] : ");
			arr2[i] = sc.nextInt();
		}

		System.out.println("======================================");
		System.out.print("arr1: "); ArrayUtil.print(arr1);
		System.out.print("arr2: "); ArrayUtil.print(arr2);
		System.out.println("======================================");
		System.out.println("<<<<< arr2를 arr1에 복사합니다. >>>>>");
		System.out.println("======================================");
		System.out.print("arr1: "); ArrayUtil.print(copy(arr1, arr2));
		System.out.print("arr2: "); ArrayUtil.print(arr2);
		System.out.println("======================================");

		sc.close();

	}
}
