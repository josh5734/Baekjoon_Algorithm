#include <iostream>
#include <algorithm>
#include <vector>

using namespace std;

int n;
vector <string> v;

int getSum(string a) {
	/* a[i] -'0' means we substract the ASCII Code 
	We used to express the alphabets and numbers in Ascii codes.
	if a[i] is equal to 1, the ascii code is equal to 49, and '0' is equal to 48юс
	
	To sum up, When we find the real number we need, we substract '0'(Ascii code)
	*/ 
	int n = a.length(), sum = 0;
	for(int i = 0; i < n; i ++){
		if(a[i] - '0' <= 9 && a[i]-'0' >= 0	){
			sum += a[i] - '0';
		}
	}
	return sum;
}

bool compare(string a, string b){
	// Order by length of String
	if(a.length() != b.length()) {
		return a.length() < b.length();
	} else{
		int aSum = getSum(a);
		int bSum = getSum(b);
		//Order by the sum of numbers in the String
		if(aSum != bSum) {
			return aSum < bSum ;
		}
		// Order by Dic
		else{
			return a < b;
		} 
	}
}

int main(){
	cin >> n;
	string input;
	for(int i = 0; i < n; i++){
		cin >> input;
		v.push_back(input);
	}
	
	sort(v.begin(), v.end(), compare);
	
	for(int i = 0; i < n; i ++){
		cout << v[i] << endl;
	}
	return 0;
	
}
