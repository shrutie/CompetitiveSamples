#include<iostream>
#include<algorithm>
using namespace std;
int main(){
	int n;
	cin>>n;
	int *arr=new int[n];
	for(int i=0;i<n;i++) cin>>arr[i];
	sort(arr,arr+n);
	cout<<arr[n-3];
	return 0;
}
