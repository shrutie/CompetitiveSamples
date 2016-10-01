#include<iostream>
using namespace std;

int main(){
	
	int left=0,right;
	int n,temp=0;
	cin>>n;
	right =n-1;
	int *arr=new int[n];
	for(int i=0;i<n;i++) cin>>arr[i];
	
	while(left<right){
		while(arr[left]%2 == 0) left++;
		while(arr[right]%2 ==1) right --;
	
	 
	 if(left<right){
	 	temp =arr[left];
	 	arr[left]=arr[right];
	 	arr[right] = temp;
		 }
	}
	
	for(int j=0;j<n;j++){
		cout<<arr[j]<<" ";
	}
		
	
	return 0;
}

