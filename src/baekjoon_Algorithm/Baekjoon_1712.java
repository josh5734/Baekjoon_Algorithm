package baekjoon_Algorithm;

import java.util.*;
public class Baekjoon_1712 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int c = sc.nextInt();
		int price = sc.nextInt();
		
		if(price <= c) System.out.println(-1);
		else{
			double x = (k / (price - c)) ;
			int answer = (int) x + 1;
			System.out.println(answer);
			
		}
		

	}

}
