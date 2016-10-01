#include<bits/stdc++.h>
using namespace std;
int main(){
	int n;
	cin>>n;
	int count=0;
	int *arr=new int[n];
	for(int i=0;i<n;i++) cin>>arr[i];
	for(int i=0;i<n;i++){
		for(int j=0;j<n-1;j++){
			if(arr[j]>arr[j+1])
			swap(arr[j],arr[j+1]);
			count++;
		}
	}
	cout<<"Array is sorted in "<<count<<" swaps."<<endl;
	cout<<"First Elemet: "<<arr[0]<<endl;
	cout<<"Last Element: "<<arr[n]<<"\n";
	return 0;
}
