#include <stdio.h>

int n;
int t =0;
int answer = 0;
int p[1001];
int time[1000];

int main(void){
	
	/* input */ 
	scanf("%d", &n); // 5Έν 
	for(int i = 0; i < n; i++){
		int m;
		scanf("%d", &m);
		p[m]++;
	}
	
	for(int i = 0; i < 1001; i++){
		while(p[i] != 0){
			answer += i;
			time[t] = answer;
			t++;
			p[i]--;
		}
	}
	answer = 0;
	for(int i = 0; i < n; i++){
		answer += time[i];
	}
	printf("%d", answer);
	return 0;
}
// 1 2 3 3 4 
// 0 1 2 3 4 5 6 ....1000 == j
// 0 1 1 2 1 0 0 ....  0  == p[j] 
