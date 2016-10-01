#include<iostream>
#include<algorithm>
using namespace std;
int calcArr(int tc){
	while(tc --){
	int n;
	cin>>n;
	if(n<1 || n>100) return 0;
	int arr[n+2];
	for(int i=0;i<n+2;i++) cin>>arr[i];
	sort(arr,arr+n+2);
	for(int i=0;i<n+2;i++){
		if(arr[i]==arr[i+1]) cout<<arr[i]<<" ";
	}
}
}
int main(){
	int tc;
	cin>>tc;
	if(tc<1 ||tc>30) return 0;
	calcArr(tc);
	return 0;
}
