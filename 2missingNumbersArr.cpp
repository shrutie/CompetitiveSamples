#include<iostream>
#include<cstring>
using namespace std;
int main(){
	int n;
	cin>>n;
	int *arr=new int[n-2];
	bool arr1[n];
	memset(arr1,false,sizeof(arr1));
	for(int i=0;i<n-2;i++){
		cin>>arr[i];
		arr1[arr[i]]=true;
	}
	for(int i=1;i<=n;i++){
		if(arr1[i]==false) cout<<i<<" ";
	}
	return 0;
}
