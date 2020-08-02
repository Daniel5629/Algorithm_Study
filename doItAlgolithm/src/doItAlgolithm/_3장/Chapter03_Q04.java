package doItAlgolithm._3장;

import java.util.Scanner;

public class Chapter03_Q04 {
	static int search(int[] a, int b, int key) {
		System.out.print("   |");
		for (int i = 0; i < b; i++) {
			System.out.printf("%4d", i);
		}
		System.out.println();

		System.out.print("---+");
		for (int i = 0; i < 4 * b + 2; i++) {
			System.out.print("-");
		}
		System.out.println();

		int front = 0;
		int back = b - 1;

		do {
			int center = (front + back) / 2;
			System.out.print("   |");

			if (front != center) {
				System.out.printf(String.format("%%%ds<-%%%ds+", (front * 4) + 2, (center - front) * 4 - 1), "", "");
			} else {
				System.out.printf(String.format("%%%ds<-+", center * 4), "");
			}

			if (center != back) {
				System.out.printf(String.format("%%%ds->\n", (back - center) * 4 - 1), "");
			} else {
				System.out.println("->");
			}

			System.out.printf("%3d|", center);
			for (int i = 0; i < b; i++) {
				System.out.printf("%4d", a[i]);
			}

			System.out.println("\n   |");

			if (a[center] == key) {
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
		System.out.println("오름차순으로 입력!");

		System.out.print("x[0] => ");
		x[0] = sc.nextInt();

		for (int i = 1; i < num; i++) {
			do {
				System.out.print("x[" + i + "] => ");
				x[i] = sc.nextInt();
			} while (x[i] < x[i - 1]);
		}

		System.out.print("찾는 값 => ");
		int ky = sc.nextInt();

		int idx = search(x, num, ky);

		if (idx == -1) {
			System.out.println("그 값의 요소가 없습니다.");
		} else {
			System.out.println(ky + "은 x[" + idx + "]에 있습니다.");
		}
		sc.close();
	}
}
