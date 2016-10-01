#include<iostream>
#include<algorithm>
#define li long long int
using namespace std;
int main(){
	li tc;
	li sum=0;
	cin >>tc;
	while(tc --){
		li n;
		cin>>n;
		li m=n;
		li arr[n];
		for(li i=0;i<n;i++){
			cin>>arr[i];
		}
		sort(arr,arr+n);
		for(li i=0;i<n;i++){
			while(i<n-1 && arr[i]==arr[i+1]){
			i++;
			}
			
			sum =sum +arr[i]*m;
			m--;
						
		}
		cout<<sum<<endl;
		
	}
	
	return 0;
}
