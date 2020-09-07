#include <iostream>

using namespace std;

int a[10001]; // if we make a[10001] as global variable, all the components become '0'. 10001 -> number range  

// 10, 5, 2, ,3, 1, 4, 2, 3, 5, 1, 7, ....100  
int main() {
	int n; 
	scanf("%d", &n); // Scan the number of data 
	for(int i = 0; i < n; i ++){
		int m; 
		scanf("%d", &m); //Scan the numbers as the size of data(n) and put them 'm'  
		a[m]++; // index plus;
		
	}
	for(int i = 0; i < 10001; i++){
		while(a[i] != 0){
			printf("%d\n", i);
			a[i]--;
		}
	}
}
 
