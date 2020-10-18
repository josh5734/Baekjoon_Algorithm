package baekjoon_Algorithm;
import java.util.Scanner;

public class Baekjoon_1316 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String nothing = sc.nextLine();
		int answer = 0; 
		for(int i = 0; i < n; i++) {
			String input = sc.nextLine();
			
			boolean groupNum = true;
			for(int j = 0; j < input.length();j++) {
				boolean start = false;
				
				int idx = 0;
				for(int k = j+1; k < input.length(); k++) {
					if(input.charAt(j) != input.charAt(k)) {
						start = true;
						idx = k;
						break;
					}
				}
				if(!start) {
					break;
				}else {
					for(int q = idx; q<input.length();q++) {
						if(input.charAt(j) == input.charAt(q)) {
							groupNum = false;
							break;
						}
					}
				}
			}
			if(groupNum) answer++;
			
		}
		System.out.print(answer);
	}

}
