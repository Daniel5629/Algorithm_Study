package doItAlgolithm._1장;

import java.util.Scanner;

public class Chapter01_Q07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n의 값 => "); int n = sc.nextInt();
		
		int sum = 0;
		String str = "";
		
		for (int i = 1; i <= n; i++) {
			sum += i;
			if (i < n) str += i + " + ";
			if (i >= n) str += i + " = ";
		}
		
		System.out.println(str+sum);
		
		sc.close();
		
	}
	
}
