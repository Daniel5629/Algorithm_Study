package doItAlgolithm._1장;

import java.util.Scanner;

public class Chapter01_Q06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n의 값 => "); int n = sc.nextInt();
		
		int sum = 0;
		
//		for (int i = 1; i <= n; i++) {
//			sum +=i;
//			System.out.println("1부터 "+i+"까지의 합은 "+sum+"입니다.");
//		}
		
		int i = 1;
		
		while(i <= n) {
			sum += i;
			i++;
			System.out.println("1부터 "+i+"까지의 합은 "+sum+"입니다.");
		}
		
		sc.close();
		
	}
	
}
