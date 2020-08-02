package doItAlgolithm.util;

public class ArrayUtil {
	public static void print(int[] arr) {
		for (int val : arr)
			System.out.print(val + " ");
		System.out.println();
	}

	public static void print(String[] arr) {
		for (String val : arr)
			System.out.print(val + " ");
		System.out.println();
	}

	public static void print(char[] arr) {
		for (char val : arr)
			System.out.print(val + " ");
		System.out.println();
	}

	public static void swap(int[] arr, int idx1, int idx2) {
		int temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;
	}

	public static void swap(String[] arr, int idx1, int idx2) {
		String temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;
	}

	public static void swap(char[] arr, int idx1, int idx2) {
		char temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;
	}

	public static void reverse(int[] arr) {
		for (int i = 0; i < arr.length / 2; i++) {
			swap(arr, i, arr.length - i - 1);
		}
	}

	public static void reverse(String[] arr) {
		for (int i = 0; i < arr.length / 2; i++) {
			swap(arr, i, arr.length - i - 1);
		}
	}

	public static void reverse(char[] arr) {
		for (int i = 0; i < arr.length / 2; i++) {
			swap(arr, i, arr.length - i - 1);
		}
	}
}
