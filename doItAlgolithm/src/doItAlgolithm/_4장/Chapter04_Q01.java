package doItAlgolithm._4장;

import java.util.Scanner;

public class Chapter04_Q01 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		IntStack s = new IntStack(64); // 최대 64개를 푸시할 수 있는 스택

		while (true) {
			System.out.println("현재 데이터 수：" + s.size() + " / " + s.capacity());
			System.out.print("(1)푸시　(2)팝　(3)피크 (4)덤프 (5)검색 (6)초기화　(0)종료：");

			int menu = stdIn.nextInt();
			if (menu == 0)
				break;

			int x;
			switch (menu) {
			case 1: // 푸시
				
				if (s.isFull()) {
					System.out.println("스택이 가득 찼습니다.");
					return;
				}
				
				System.out.print("데이터：");
				x = stdIn.nextInt();
				
				try {
					s.push(x);
				} catch (IntStack.OverflowIntStackException e) {
					e.printStackTrace();
				}
				break;

			case 2: // 팝
				try {
					
					if (s.isEmpty()) {
						System.out.println("스택이 비어 있습니다.");
						return;
					}
					
					x = s.pop();
					System.out.println("팝한 데이터는 " + x + "입니다.");
					
					
				} catch (IntStack.EmptyIntStackException e) {
					e.printStackTrace();
				}
				break;

			case 3: // 피크
				try {
					
					if (s.isEmpty()) {
						System.out.println("스택이 비어 있습니다.");
						return;
					}
					
					x = s.peek();
					System.out.println("피크한 데이터는 " + x + "입니다.");
					
					
				} catch (IntStack.EmptyIntStackException e) {
					e.printStackTrace();
				}
				break;

			case 4: // 덤프
				s.dump();
				break;
				
			case 5: // 위치 검색
				System.out.print("데이터：");
				x = stdIn.nextInt();
				int idx = s.indexOf(x);
				
				if(idx!=-1) {
					System.out.println("찾으시는 데이터는 ["+idx+"]에 있습니다.");
					return;
				}
				
				System.out.println("찾으시는 데이터는 없습니다.");
				
				break;
				
			case 6: // 초기화
				s.clear();
				break;
			}
		}

		stdIn.close();

	}
}
