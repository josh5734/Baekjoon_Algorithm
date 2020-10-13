package baekjoon_Algorithm;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Beakjoon_1152 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();
		
		StringTokenizer tc = new StringTokenizer(sentence, " ");
		int answer = tc.countTokens();
		System.out.println(answer);
	}

}
