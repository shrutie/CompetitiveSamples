#include<bits/stdc++.h>
using namespace std;
int main(){
	int n;
	cin>>n;
	int *arr=new int[n];
	for(int i=0;i<n;i++) cin>>arr[i];

	for(int k=n;k>0;k--){
			int swapi=0;
	for(int i=n;i>0;i--){
		if(arr[i] < arr[i-1]){
			swap(arr[i-1],arr[i]);
			swapi++;
		}
	}
	if(swapi>2)
		{
			cout<<"Too chaotic: "<<swapi<<endl;
			//return 0;
		}
	else
	cout<<"Number: "<<swapi<<endl;
	}
	for(int i=1;i<=n;i++) cout<<arr[i]<<" ";
	
	return 0;
}
