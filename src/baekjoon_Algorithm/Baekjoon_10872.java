package baekjoon_Algorithm;
import java.util.Scanner;
public class Baekjoon_10872 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n == 0) System.out.println(1);
		else {
			int answer = factorial(n);
			System.out.println(answer);
		}
	}
	
	public static int factorial(int n) {
		if(n == 1) return 1;	
		return n * factorial(n-1);
	}

}
