package doItAlgolithm._1장;

import java.util.Scanner;

public class Chapter01_Q12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("만들 곱셈표 단 => ");
		int n = sc.nextInt();
		
		System.out.print("   |");
		for (int i = 1; i <= n; i++) {
			System.out.print("  "+i);
		}
		
		System.out.println();
		System.out.print("---+");
		
		for (int i = 1; i <= n; i++) {
			System.out.print("---");
		}
		System.out.println();
		
		for (int i = 1; i <= n; i++) {
			System.out.print(" "+i+" |");
			for (int j = 1; j <= n; j++) {
				System.out.print("  "+(i*j));	
			}
			System.out.println();
		}
		
		sc.close();
	}

}
