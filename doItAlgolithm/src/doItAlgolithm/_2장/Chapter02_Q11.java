package doItAlgolithm._2장;

import java.util.Scanner;

public class Chapter02_Q11 {

	// 배열 a의 앞쪽 n개 요소에서 key와 같은 모든 요소의 index를 배열idx의 머리부터 차례로 저장하여 같은 요솟수를 반환
	static int searchIdx(int[] a, int n, int key, int[] idx) {
		int count = 0; // key와 같은 요솟수
		for (int i = 0; i < n; i++) {
			if (a[i] == key) {
				idx[count++] = i;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("요솟수：");
		int num = sc.nextInt();
		int[] x = new int[num];
		int[] y = new int[num];

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]：");
			x[i] = sc.nextInt();
		}
		System.out.print("찾는 값：");
		int ky = sc.nextInt();

		int count = searchIdx(x, num, ky, y);

		if (count == 0) {
			System.out.println("그 값의 요소가 없습니다.");
		} else {
			for (int i = 0; i < count; i++) {
				System.out.println("그 값은 " + "x[" + y[i] + "]에 있습니다.");
			}

		}

		sc.close();
	}
}
