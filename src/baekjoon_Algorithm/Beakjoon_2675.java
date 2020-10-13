package baekjoon_Algorithm;

import java.util.Scanner;
public class Beakjoon_2675 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		
		for(int i = 0 ; i < n ; i++) {
			String input = sc.nextLine();
			int a = Integer.parseInt(input.split(" ")[0]);
			String words = input.split(" ")[1];
			for(int j = 0 ; j<words.length();j++) {
				for(int k = 0; k < a; k++) {
					System.out.print(words.charAt(j));
				}
			}System.out.println();
		}
	}

}
