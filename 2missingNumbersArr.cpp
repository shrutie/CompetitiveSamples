#include<iostream>
#include<cstring>
using namespace std;
//Aug 26, 2018
/* arr1: boolean array which is initialised as false for all the values from 1 to n, while taking inputs.
* Second loop: Traverse till n and print the values for which arr1 as false value.
*/
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
