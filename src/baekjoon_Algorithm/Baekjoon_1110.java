package baekjoon_Algorithm;

import java.util.*;
public class Baekjoon_1110 {

	static int cnt;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int answer = 0;
		int n = sc.nextInt();
		answer = recur(n,n);
		System.out.println(answer);
		
	}
	
	public static int recur(int origin, int n) {
		
		int first = n / 10;
		int second = n % 10;
		int plusNum = (first + second) % 10;
		cnt++;
		int newNum = (second * 10) + plusNum;
		if(newNum == origin) return cnt;
		return recur(origin, newNum);		
	}

}
