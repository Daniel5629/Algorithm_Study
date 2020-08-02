package doItAlgolithm._3장;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Chapter03_Q07 {
	static class PhyscData {
		private String name; // 이름
		private double vision; // 시력

		public PhyscData(String name, double vision) {
			this.name = name;
			this.vision = vision;
		}
		
		public String toString() {
			return "이름:"+ name +"| 시력: "+ vision;
		}

		public static final Comparator<PhyscData> VISION_ORDER = new VisionOrderComparator();

		private static class VisionOrderComparator implements Comparator<PhyscData> {
			public int compare(PhyscData d1, PhyscData d2) {
				return (d1.vision > d2.vision) ? 1 : (d1.vision < d2.vision) ? -1 : 0;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PhyscData[] x = { 
				new PhyscData("이나령", 0.3),
				new PhyscData("유지훈", 0.4),
				new PhyscData("김한결", 0.8),
				new PhyscData("홍준기", 1.5),
				new PhyscData("전서현", 0.7),
				new PhyscData("이호연", 1.2),
				new PhyscData("이수민", 2.0),
				};
		System.out.print("시력이 얼마인 사람을 찾고 있나요? => ");
		double vision = sc.nextDouble();
		int idx = Arrays.binarySearch(x, new PhyscData("", vision), PhyscData.VISION_ORDER);

		if (idx < 0) {
			System.out.println("그 값의 요소가 없습니다.");
		}else {
			System.out.println("그 값은 " + "x[" + idx + "]에 있습니다. => " + x[idx]); // toString 자동으로 됨
		}
		sc.close();
	}
}
