#include<iostream>
using namespace std;
int main(){
	int arr[]={16,17,4,3,5,2};
	int maxe=arr[5];
	cout<<maxe<<" ";
	for(int i=4;i>=0;i--){
		
		if(arr[i]>maxe){		
		cout<<arr[i]<<" ";
		maxe =arr[i];
		}
	}
	return 0;
}
