#include<bits/stdc++.h>
using namespace std;
/* Condition given i<j and a[i]+a[j] is divisible by ;
return the number of such sets possible in an array.
 */
int main(){
	int n,k;
	cin>>n>>k;
	int count=0;
	int *arr=new int[n];
	for(int i=0;i<n;i++) cin>>arr[i];
	sort(arr,arr+n);
	for(int i=0;i<n;i++){
		for(int j=i+1;j<n;j++){
		if(i<j && ((arr[i]+arr[j])%k)==0)	count++;
		}
	}
	cout<<count;
	}
