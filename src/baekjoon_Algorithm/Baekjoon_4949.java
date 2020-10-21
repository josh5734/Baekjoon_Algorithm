package baekjoon_Algorithm;

import java.util.*;

public class Baekjoon_4949 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while(flag) {
			Stack<String> s = new Stack<String>();
			String[] input = sc.nextLine().split("");
			if(input[0].equals(".") && input.length == 1) {
				flag = false;
				break;
			}
			boolean VPS = true;
			for(int i = 0; i < input.length; i++) {
				if(input[i].equals("(") || input[i].equals("[")) {
					//System.out.println("add합니다.");
					s.add(input[i]);
				}
			
				if(input[i].equals(")") || input[i].equals("]")) {
					if(s.isEmpty()) {
						VPS = false;
						break;
					}else {
						if((input[i].equals(")") &&  s.peek().equals("(")) ||
								(input[i].equals("]") &&  s.peek().equals("["))) {
							//System.out.println("pop합니다.");
							s.pop();
						}
						else {
							VPS = false;
							break;
						}
					}
				}
			}
			if(s.isEmpty() && VPS) System.out.println("yes");
			else System.out.println("no");
		}
		


	}
}
