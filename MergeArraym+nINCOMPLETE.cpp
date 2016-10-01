#include<iostream>
#define NA -1
using namespace std;
void mergeArr(int [],int,int[]);
void movetoEnd(int arrMN[], int mn,int arrN[]){
	int j= mn-1;
	int arr[mn];
	for(int i=0;i<mn;i++){
		if(arrMN[i] != NA){
		arr[j]=arr[i];
		j--;
		}
	}
	mergeArr(arr,mn,arrN);
	for(int x=0;x<mn;x++){
		cout<<arr[x]<<" ";
	}
	
}
void mergeArr(int arr[],int n,int arrN[]){
	
	int i=n;
	int j=0;
	int k=0;
	while(k<n){
	if(arr[i]<= arrN[j]){
		arr[k] =arr[i];
		j++;k++;
	}
	else{
	arr[k]=arrN[j];
	j++;k++;
	}
	
}
}




int main(){
	int mn,n;
	cout<<"Enter m+n and n";
	cin>>mn>>n;
	int *arrMN =new int[mn];
	int *arrN =new int[n];
	cout<<"Enter NA where no value is present"<<endl;
	for(int i=0;i<mn;i++){
		cin>>arrMN[mn];
	}
	for(int i=0;i<n;i++){
		cin>>arrN[n];
	}
	
	movetoEnd(arrMN,mn,arrN);
	
	return 0;
	}
