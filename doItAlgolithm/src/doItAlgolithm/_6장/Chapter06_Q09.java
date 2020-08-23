package doItAlgolithm._6장;

import java.util.Scanner;

public class Chapter06_Q09 {
	// version1
	static int shellSortVer01(int[] a, int n) {
		int count = 0; // 옮김횟수
		for (int h = n / 2; h > 0; h /= 2)
			for (int i = h; i < n; i++) {
				int j;
				int tmp = a[i];
				for (j = i - h; j >= 0 && a[j] > tmp; j -= h) {
					a[j + h] = a[j];
					count++;
				}
				a[j + h] = tmp;
				count++;
			}
		return count;
	}
	
	// version2
	static int shellSortVer02(int[] a, int n) {
		int count = 0; // 옮김 횟수
		int h;
		for (h = 1; h < n / 9; h = h * 3 + 1)
			;

		for (; h > 0; h /= 3)
			for (int i = h; i < n; i++) {
				int j;
				int tmp = a[i];
				for (j = i - h; j >= 0 && a[j] > tmp; j -= h) {
					a[j + h] = a[j];
					count++;
				}
				a[j + h] = tmp;
				count++;
			}
		return count;
	}
	

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("1: 셸정렬(버전 1)/ 2: 셸정렬(버전 2)");
		int ver = stdIn.nextInt();
		
		System.out.print("요솟수：");
		int nx = stdIn.nextInt();
		int[] x = new int[nx];

		for (int i = 0; i < nx; i++) {
			System.out.print("x[" + i + "]：");
			x[i] = stdIn.nextInt();
		}
		
		int count = 0;
		
		if(ver==1) {
			count = shellSortVer01(x, nx);
			System.out.println("셸정렬(버전 1) 완료");
		}else {
			count = shellSortVer02(x, nx);
			System.out.println("셸정렬(버전 2) 완료");
		}
		
		System.out.println("오름차순으로 정렬했습니다.");
		for (int i = 0; i < nx; i++)
			System.out.println("x[" + i + "]＝" + x[i]);
		System.out.println("요소의 옮김횟수는 " + count + "회입니다.");
		
		stdIn.close();
	}
}
