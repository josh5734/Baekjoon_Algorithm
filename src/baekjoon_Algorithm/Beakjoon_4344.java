package baekjoon_Algorithm;

import java.util.Scanner;
public class Beakjoon_4344 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		
		
		for(int i = 0; i < num; i++) {
			String[] input = sc.nextLine().split(" ");
			int sum = 0;
			double avg = 0;
			int overAvg = 0;
			double answer = 0;
			for(int j = 1; j < input.length; j++) {
				sum += Integer.parseInt(input[j]);
			}
			avg = sum / Integer.parseInt(input[0]);
			for(int j = 1; j < input.length; j++) {
				if(Integer.parseInt(input[j]) > avg) overAvg++;
			}
			answer = 100* overAvg / Double.parseDouble((input[0])) ;
			System.out.printf("%.3f",answer);
			System.out.print("%");
			System.out.println();
		}

	}

}
