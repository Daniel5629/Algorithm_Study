package doItAlgolithm._2장;

import java.util.Scanner;

import doItAlgolithm.util.ArrayUtil;

public class Chapter02_Q02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("요솟수 => ");
		int num = sc.nextInt();

		int[] arr = new int[num];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("arr[" + i + "] : ");
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < arr.length / 2; i++) {
			ArrayUtil.print(arr);

			System.out.println("arr[" + i + "]와 arr[" + (arr.length - i - 1) + "]를 교환합니다.");
			ArrayUtil.swap(arr, i, arr.length - i - 1);
		}
		
		ArrayUtil.print(arr);
		System.out.println("역순 정렬을 마쳤습니다.");

		sc.close();

	}
}
