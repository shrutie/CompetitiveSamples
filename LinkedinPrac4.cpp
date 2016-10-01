#include<bits/stdc++.h>
using namespace std;
//I havent understood this completely!
// https://www.hackerrank.com/challenges/xor-se
long long xorPow(long long n){
	int val=n%8;
	if(val==0 || val==1) return n;
	if(val==2 || val==3) return 2;
	if(val==4 || val==5) return n+2;
	if(val==6 || val==7) return 0;
	return 0;
}
int main(){
	long long tc;
	cin>>tc;
	while(tc--){
		long long left,right,res;
		cin>>left>>right;
		 res = xorPow(right)^ xorPow(left-1);
		cout<<res<<endl;
	}
	return 0;
}
