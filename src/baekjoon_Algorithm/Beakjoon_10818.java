package baekjoon_Algorithm;

import java.util.Scanner;
public class Beakjoon_10818 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		
		int[] arr = new int[n];
		for(int i = 0 ; i < n; i ++) {
			arr[i] = sc.nextInt();
		}
		int min = arr[0];
		int max = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(min > arr[i]) min = arr[i];
			if(max < arr[i]) max = arr[i];
			
		}
		System.out.print(min + " "+ max);
	}

}
