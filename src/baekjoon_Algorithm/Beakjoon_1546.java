package baekjoon_Algorithm;

import java.util.*;
public class Beakjoon_1546 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String nothing = sc.nextLine();
		
		String[] score = sc.nextLine().split(" ");
		
		double max = 0;
		double avg = 0;
		double sum = 0;
		for(String x: score) {
			double s = Double.parseDouble(x);
			sum += s;
			if(max < Integer.parseInt(x)) max = s;
		}
		
		avg = 100 * sum / max / n;
		System.out.println(avg);
		
	}

}
