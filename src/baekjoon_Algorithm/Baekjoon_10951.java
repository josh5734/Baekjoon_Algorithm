package baekjoon_Algorithm;


import java.util.*;
public class Baekjoon_10951 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) { //in JAVA, EOF
			String input = sc.nextLine();
			String[] str = input.split(" ");
			int a = Integer.parseInt(str[0]);
			int b = Integer.parseInt(str[1]);
			System.out.println(a+b);	
		}
		sc.close();
	}

}
