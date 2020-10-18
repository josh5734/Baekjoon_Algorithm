package baekjoon_Algorithm;

import java.util.Scanner;

public class Beakjoon_8958 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String nothing = sc.nextLine();
		int time = 0;
		while(true) { 
			
			String[] input = sc.nextLine().split("");
			int score = 0; 
			int cnt = 0;
			
			for(int i = 0; i < input.length; i++) {
				switch(input[i]){
				
					case "O":
						cnt++;
						score += cnt;
						break;
						
					case "X":
						cnt = 0;
						break;
				}
			}
			System.out.println(score);
			time++;
			if(time == n) break;
		}
		
		

	}

}
