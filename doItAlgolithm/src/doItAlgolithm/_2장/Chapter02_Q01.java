package doItAlgolithm._2장;

import java.util.Random;

public class Chapter02_Q01 {
	static int maxOf(int[] a) {
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		Random ran = new Random();

		System.out.println("키의 최대값을 구합니다.");
		System.out.print("사람 수 : ");
		int num = ran.nextInt(10);
		System.out.println(num);
		
		int[] height = new int[num];
		
		System.out.println("키 값은 아래와 같습니다.");
		for (int i = 0; i < height.length; i++) {
			height[i] = 100 + ran.nextInt(90);
			System.out.println("height["+i+"]: "+height[i]);
		}
		
		System.out.println("최대값은 "+ maxOf(height)+"입니다.");
	}
}
