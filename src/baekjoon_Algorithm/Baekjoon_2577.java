package baekjoon_Algorithm;

import java.util.*;
public class Baekjoon_2577 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		String w = Integer.toString(a * b * c);
		int[] ans = new int[10];

		for(int i = 0; i < w.length();i++) {
			int number = w.charAt(i)-48;
			//System.out.println(number);
			ans[number]++;
		}
		for(int x: ans) System.out.println(x);
	}

}
