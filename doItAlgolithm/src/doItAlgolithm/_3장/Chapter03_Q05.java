package doItAlgolithm._3장;

import java.util.Scanner;

public class Chapter03_Q05 {
	static int binSearchX(int[] a, int n, int key) {
		int front = 0;
		int back = n - 1;

		do {
			int center = (front + back) / 2;
			if (a[center] == key) {
				for (; center > front; center--) {
					if (a[center - 1] < key) {
						break;
					}
				}
				return center;
			} else if (a[center] < key) {
				front = center + 1;
			} else {
				back = center - 1;
			}
		} while (front <= back);

		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("요솟수 => ");
		int num = sc.nextInt();
		int[] x = new int[num];

		System.out.println("오름차순으로 입력하세요.");

		System.out.print("x[0] => ");
		x[0] = sc.nextInt();

		for (int i = 1; i < num; i++) {
			do {
				System.out.print("x[" + i + "] => ");
				x[i] = sc.nextInt();
			} while (x[i] < x[i - 1]);
		}

		System.out.print("key 값 => ");
		int ky = sc.nextInt();

		int idx = binSearchX(x, num, ky);

		if (idx == -1) {
			System.out.println("그 값의 요소가 없습니다.");
		} else {
			System.out.println(ky + "은 x[" + idx + "]에 있습니다.");
		}
		sc.close();
	}
}
