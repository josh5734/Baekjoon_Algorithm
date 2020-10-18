package baekjoon_Algorithm;

import java.util.Scanner;
public class Baekjoon_2908 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int first = sc.nextInt();
		int second = sc.nextInt();
		String str1 = Integer.toString(first);
		String str2 = Integer.toString(second);
		String answer = "";
		for(int i = str1.length()-1; i >= 0; i--) {
			if(str1.charAt(i) == str2.charAt(i)){
				continue;
			}
			else if(str1.charAt(i) > str2.charAt(i)) {
				for(int j = str1.length()-1; j >= 0; j--) {
					System.out.print(str1.charAt(j));
				}

				break;
			}else {
				for(int j = str1.length()-1; j >= 0; j--) {
					System.out.print(str2.charAt(j));
				}
				break;
			}
		}
		
	}
	

}
/** reverse하는 풀이
 		Scanner in = new Scanner(System.in);
        
		int A = in.nextInt();
		int B = in.nextInt();
        
        in.close();
        
		A = Integer.parseInt(new StringBuilder().append(A).reverse().toString());
		B = Integer.parseInt(new StringBuilder().append(B).reverse().toString());
		
		System.out.print(A > B ? A : B);
	
	}
}

*/