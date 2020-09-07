#include <iostream>
#include <algorithm>

using namespace std;

string a[20000];
int n;

bool compare(string a, string b){
	// Shorter String first!
	if(a.length() < b.length()){
		return 1;
	}else if(a.length() > b.length())
		return 0;
	
	// if the lengths are same,
	
	else {
		return a < b; // it can be compared by the order of Dictionary 
	}	
}

int main(void){
	cin >> n;
	for(int i = 0; i < n; i ++){
		cin >> a[i];
	}
	sort(a, a+n, compare);
	for(int i = 0; i < n; i++){
		if(i > 0 && a[i] == a[i-1]) continue;
		cout << a[i] << '\n';
	}
	return 0;
}
