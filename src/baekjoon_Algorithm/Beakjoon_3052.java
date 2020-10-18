package baekjoon_Algorithm;
import java.util.*;
public class Beakjoon_3052 {

	public static void main(String[] args) {
		
		int answer = 1;
	
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int cnt = 0;
		while(cnt < 10) {
			arr[cnt] = sc.nextInt() % 42;
			cnt++;
			
		}
		for(int i = 1; i < 10; i++) {
			boolean flag = true;
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					flag = false;
					break;
				}
			}if(flag) answer++;
		}
		System.out.println(answer);
		

	}

}
