package baekjoon_Algorithm;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_2167 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int N = Integer.parseInt(str[0]);
		int M = Integer.parseInt(str[1]);
		int[][] arr = new int[N][M];
		
		for(int i = 0; i < N; i ++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for(int j = 0; j < M; j++) {
				  arr[i][j] = Integer.parseInt(st.nextToken());
			}	
		}
		for(int j = 0; j < N; j ++) {
			for(int k = 0; k < M; k++) {
				System.out.print(arr[j][k]+ " ");
			}System.out.println();
		}
		
		int time = Integer.parseInt(br.readLine());
		for(int i = 0 ; i< time; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			int answer = 0;
			for(int j = x1-1; j < x2; j++) {
				for(int k = y1-1; k < y2; k++) {
					answer += arr[j][k];
				}
			}System.out.println(answer);
		}
		
		
		
		
		
		
		
		
		br.close();
	}

}
