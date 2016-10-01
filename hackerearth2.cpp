#include<iostream>
using namespace std;
int main(){
	int tc,n,n1;
		int sum=0;
	cin >>tc;
	while(tc --){
		cin >> n >> n1;
		sum = sum+n +n1;
	}
	cout<< sum;
	
	return 0;
}
