#include<bits/stdc++.h>
using namespace std;
#define ll long long
ll fibo(int n){
	if(n==0 || n==1) return 1;
	else if(n>2)
	return (fibo(n-1) + fibo(n-2)+1);
}
int main(){
	ll n,m;
	ll sum=0;
	cin>>n>>m;
	//if(n<1 || n > (10^5) || m <2 || m >(10^9)) return 0;
	ll *arr = new ll[n];
	for(ll i=0;i<n;i++){
		cin>>arr[i];
		if(arr[i]<1 ||arr[i]>(10^9)) return 0;
		sum = sum + fibo(arr[i]);	
	} 
	cout<< sum;
	
	return 0;
}
