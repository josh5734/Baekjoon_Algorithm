package baekjoon_Algorithm;


import java.util.*;

public class Baekjoon_9012 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String junk = sc.nextLine();
		
		for(int i = 0 ; i < n; i++) {
			Stack<String> s1 = new Stack<String>();
			
			String[] input = sc.nextLine().split("");
			boolean VPS = true;
			for(int j = 0; j < input.length; j++) {
				switch(input[j]) {
				case "(":
					s1.add(input[j]);
					break;
				case ")":
					if(s1.isEmpty()) {
						VPS = false;
						break;
					}else {
						s1.pop();
						break;
					}
				}
			}
			if(!s1.isEmpty()) VPS = false;
			String answer = (VPS ? "YES":"NO");
			System.out.println(answer);
		}

	}

}
