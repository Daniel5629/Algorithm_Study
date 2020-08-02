package doItAlgolithm._3장;

import java.util.Arrays;
import java.util.Scanner;

public class Chapter03_Q02 {
    // 선형검색(liner search) or 순차검색(sequential search)
    static int seqSearch(int[] a , int n, int key) {
        int i = 0;

        // 검색하고자 하는 배열, 배열의 크기, 찾고자 하는 값을
        // 파라미터로 전달시 그리드를 그려준다.
        printGrid(a, n, key);

        while (true) {
            if (i == n) return -1; // 검색 실패
            if (a[i] ==key) return i; // 검색 성공
            i++;
        }
    }
    
    static void printGrid(int[] arr , int num, int key) {
        // 배열내 숫자를 제외한 문자를 공백으로 치환
        String str = Arrays.toString(arr).replaceAll("[^0-9 ]"," ");

        System.out.print("   |");

        // 탭 후
        for (int n1 = 0; n1 < num; n1++) {
            System.out.print("  "+n1);
        }

        System.out.println();
        System.out.print("---+");

        // 배열 인덱스가 증가함에 따라 구분선 길이를 늘림
        for (int n2 = 0; n2 < num; n2++){
            System.out.print("---");
        }

        System.out.println();

        // 현재 판단중인 배열 인덱스 위에 별 표시
        // 배열 값에서 찾고자 하는 값을 발견시 검색 종료.
        for (int n3 = 0; n3 < num; n3++) {
            System.out.print("   |  ");
            for (int n4 = 0; n4 < n3; n4++) System.out.print("   ");
            System.out.println("*");
            System.out.print("  " + n3 + "| ");
            System.out.println(str);
            if (arr[n3] == key) break;
            System.out.println("   |");

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요솟수 => ");
        int num = sc.nextInt();
        int[] x = new int[num]; // 요소수가 입력받은 값인 배열

        for (int i = 0; i < num; i++) {
            System.out.print("x["+ i +"] => ");
            x[i] = sc.nextInt();
        }

        System.out.print("검색할 값 => "); // 키값 입력
        int ky = sc.nextInt();
        int idx = seqSearch(x, num, ky); // 배열 x에서 키값이 ky인 요소 검색

        if (idx == -1) {
            System.out.print("입력하신 값의 요소가 없습니다.");
        }else {
            System.out.print(ky+"은(는) x["+ idx +"]에 있습니다.");
        }
        sc.close();
    }
}
