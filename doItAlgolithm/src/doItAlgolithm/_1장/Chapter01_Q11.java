package doItAlgolithm._1장;

import java.util.Scanner;

public class Chapter01_Q11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = "";
		
		System.out.print("양의 정수를 입력하세요 => ");
		n = sc.nextLine();

		String arr[] = n.split(""); 

		System.out.println("그 자리수는 "+arr.length+"입니다.");
		
		sc.close();

	}

}
