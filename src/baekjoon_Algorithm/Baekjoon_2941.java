package baekjoon_Algorithm;

import java.util.*;
public class Baekjoon_2941 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String answer = "";
		boolean flag = false;
		while(input.length() >0) {
			flag = false;
			for(int j = 0; j < input.length(); j++) {
				String temp = input.substring(0, j+1);
				System.out.println("추출하는 단어는: "+ temp);

				if(temp.equals("c-") || temp.equals("c=") || temp.equals("dz=")
						|| temp.equals("d-") || temp.equals("lj") || temp.equals("nj")
						|| temp.equals("s=")|| temp.equals("z=")) {
					System.out.println("크로아티어 언어입니다." + temp);
					answer += "X";
					input = input.substring(j+1);
					flag = true;
					break;
				}
			}if(!flag) {
				answer += "X";
				input = input.substring(1);
			}
		}
		/*String last = input.substring(input.length()-2);
		if(last.equals("c-") || last.equals("c=") 
				|| last.equals("d-") || last.equals("lj") || last.equals("nj")
				|| last.equals("s=")|| last.equals("z=")){
			answer += "X";
		}else {
			answer += "XX";
		}*/
		int count = 0;
		count = answer.length();
		System.out.println(answer);
		System.out.println(count);
	}

}
