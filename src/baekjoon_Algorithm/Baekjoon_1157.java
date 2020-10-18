package baekjoon_Algorithm;
import java.util.Scanner;
public class Baekjoon_1157 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine().toUpperCase();
		int[] alphabet = new int[26];
		
		for(int i = 0; i<input.length();i++) {
			alphabet[(int)input.charAt(i)-65]++;
		}
		int max = 0;
		int index = 0;
		for(int i = 0; i < alphabet.length; i++) {
			if(max < alphabet[i]) {
				max = alphabet[i];
				index = i;
			}
		}
		int cnt = 0;
		for(int i = 0; i < alphabet.length; i++) {
			if(alphabet[i] == max) cnt++;
		}
		if(cnt > 1) System.out.println("?");
		else System.out.println((char)(index+65));
		
		
	}

}
