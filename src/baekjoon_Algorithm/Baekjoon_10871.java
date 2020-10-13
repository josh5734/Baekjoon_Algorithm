package baekjoon_Algorithm;

import java.util.Scanner;

public class Baekjoon_10871 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		
		String nothing = sc.nextLine();
		
		for(int i = 0; i < N; i++) {
			int number = sc.nextInt();
			if(number < X) {
				System.out.print(number+ " ");
			}
		}
	}

}
