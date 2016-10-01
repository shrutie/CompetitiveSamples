#include<bits/stdc++.h>
using namespace std;
int main(){
	int n;
	cin>>n;
	int *arr=new int[n];
	for(int i=0;i<n;i++){
		cin>>arr[i];
	}
	int x1=arr[0];
	int x2=1;
	for(int i=1;i<n;i++){
		x1^=arr[i];
	}
	for(int i=2;i<=n+1;i++) x2^=i;
	cout<<(x1^x2)<<endl;
	return 0;
}
