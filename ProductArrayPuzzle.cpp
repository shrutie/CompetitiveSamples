#include<iostream>
using namespace std;
int main(){
	int n;
	cin >>n;
	int arr[n],prod[n];
	for(int i=0;i<n;i++) cin>>arr[i];
	int pr =1;
	for(int i=0;i<n;i++){
	prod[i]=pr;
	pr=pr*arr[i];
	}
	pr=1;
	for(int i=n-1;i>=0;i--){
		prod[i]=prod[i]*pr;
		pr=pr*arr[i];
	}
	for(int i=0;i<n;i++) cout<<prod[i]<<" ";
	
	return 0;
}
