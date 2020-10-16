package baekjoon_Algorithm;

import java.util.Scanner;
public class Baekjoon_2562 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9];
		for(int i = 0; i < 9; i++) {
			arr[i] = Integer.parseInt(sc.nextLine());
		}
		int max = arr[0];
		int idx = 0;
		for(int i = 1; i < arr.length;i++) {
			if(arr[i] > max) {
				max = arr[i];
				idx = i;
			}
			
		}
		System.out.println(max);
		System.out.println(idx+1);
		
	}

}
