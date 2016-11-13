#include<bits/stdc++.h>
using namespace std;
int main(){
	int n;
	cin>>n;
	int *arr= new int[n];
	int rot;
	cin>>rot;
	for(int i=0;i<n;i++){
		cin>>arr[i];
	}	
	for(int i=0;i<rot;i++){
		int x = arr[n-1];
		for(int j=n;j>0;j--){
			arr[j]=arr[j-1];
		}
		arr[0]=x;
	}
	cout<<"Output:"<<endl;
	for(int i=0;i<n;i++) cout<<arr[i]<<" ";
	return 0;
}
