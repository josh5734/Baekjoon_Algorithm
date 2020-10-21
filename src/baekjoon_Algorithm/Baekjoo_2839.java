package baekjoon_Algorithm;

import java.util.*;
public class Baekjoon_2839 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean available = false;
		int max3 = n/3;
		int max5 = n/5;
		
		for(int i = 0; i <= max3; i++){
			for(int j = 0 ; j <= max5; j++) {
				if(3 * i + 5 * j == n) {
					System.out.println(i+j);
					available = true;
					return;
				}
			}
		}
		if(!available) System.out.println(-1);
			
	}
		
}
