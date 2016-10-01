#include<iostream>
using namespace std;
void binarysearch(int beg,int end,int x,int ary[]){
	for(int i=beg;i<end;i++)
	if(x==ary[i])
	cout<<"Found at"<<i+1<<endl;
}
int main(){
	int arr[5];
	int pivot=0;
	int search=0;
	for(int i=0;i<5;i++)
	cin>>arr[i];
	cout<<"Enter element to search?"<<endl;
	cin>>search;
	for(int i=0;i<5;i++){
		if(arr[i+1]<arr[i]){
			pivot=i;
		if(search <arr[i])
		binarysearch(pivot,5,search,arr);
		else if(search>arr[i])
		binarysearch(0,pivot,search,arr);
		else if(search == arr[i])
		cout<<"Found at"<<i+1<<endl;
		
	}
	}
	
	
	return 0;
}
