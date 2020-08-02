package doItAlgolithm._1장;

import java.util.Scanner;

public class Chapter01_Q08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구합니다(가우스)");
		System.out.print("n의 값 => ");
		int n = sc.nextInt();
		
		// 가우스
		int result = ((1+ n)*n)/2; 
		
		System.out.println("결과값 => " +result);
		
		
		sc.close();
		
	}
	
}
