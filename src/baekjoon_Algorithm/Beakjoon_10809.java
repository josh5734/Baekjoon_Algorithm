package baekjoon_Algorithm;
import java.util.Scanner;
public class Beakjoon_10809 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		input = input.toUpperCase();
		for(int i = 65; i < 91; i++) {
			char x = (char)i;
			System.out.print(input.indexOf(x)+ " ");
		}
		
	}

}
