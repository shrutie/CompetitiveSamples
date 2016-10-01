#include<bits/stdc++.h>
using namespace std;
int main(){
	int n,r;
	cin>>n>>r;
	int *arr=new int[n];
	for(int i=0;i<n;i++) cin>>arr[i];
	int start =0;
	int end=n-1;
	while(r--){
		int temp=arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
		start ++;
		end--;
		
	}
	
	for(int i=0;i<n;i++) cout<<arr[i]<<" ";
	return 0;
}
