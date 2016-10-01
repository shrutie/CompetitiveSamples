#include<iostream>
using namespace std;
int main(){
	int n,k;
//	int activ=0,inactiv=0;
	cin>>n;
	cout<<"Enter k";
	cin>>k;
	if(n<3) return 0;
	int *arr=new int[n];
	int *temp =new int[n];
	for(int i=0;i<n;i++){
		cin>>arr[i];
		temp[i]=arr[i];
	}
	while(k--){
	for(int i=0;i<n;i++){
		if(i==0 && arr[1]==0 || i==n-1 && arr[n-2]==0 || arr[i-1]==arr[i+1]) //took you 2 hrs to figure it out n-1 is the last element Idiot.
		temp[i]=0;	
		else temp[i]=1; //else statement was missing since the last 2 hrs!
	}
	for(int j=0;j<n;j++) arr[j]=temp[j];
	}
	int activ=0,inactiv=0;
	for(int i=0;i<n;i++){
		if(arr[i]==0) inactiv++;
		else if(arr[i]==1) activ ++;
		cout<<arr[i]<<" ";
	}
	cout<<"Inactive cells: "<<inactiv<<endl;
	cout<<"Active cells: "<<activ<<endl;
	
	return 0;
}
