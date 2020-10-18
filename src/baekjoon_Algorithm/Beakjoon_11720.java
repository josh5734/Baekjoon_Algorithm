package baekjoon_Algorithm;
import java.util.Scanner;
public class Beakjoon_11720 {

	public static void main(String[] args) {
		int answer = 0;
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		String nothing = sc.nextLine();
		String[] number = sc.nextLine().split("");
		for(int i = 0 ; i < n; i++) {
			answer += Integer.parseInt(number[i]);
			
		}
		System.out.println(answer);
	}

}
