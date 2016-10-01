#include<bits/stdc++.h>
using namespace std;
int main(){
	int n;
	int min =INT_MAX,maxl=INT_MIN;
	cin>>n;
	int *arr=new int[n];
	for(int i=0;i<n;i++) cin>>arr[i];
	for(int i=0;i<n;i++){
		int val=arr[i]-i;
	if(val > maxl) maxl = val;
	if(val < min) min = val;
	
	}
	cout<<maxl<<endl;
	cout<<min<<endl;
	cout<<maxl-min;
	return 0;
}
