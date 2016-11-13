#include<bits/stdc++.h>
using namespace std;
int main(){
	int n;
	cin >>n;
	if(n<1 || n>1000) return 0;
	int min_arr;
	int*arr = new int[n];
	for(int i=0;i<n;i++){
	 cin>>arr[i];
	 if(arr[i] <1 || arr[i]>1000) return 0;	
	}
	sort(arr,arr+n);
	cout<<n<<endl;
		for(int i=0;i<n-1;i++){
			if(arr[i]!= arr[i+1])
			cout<<(n-(i+1))<<endl;
			//Deduction on the basis of output data analysis.
		}
		return 0;
}
