#include<bits/stdc++.h>
using namespace std;
//void putZero(int[],int,int);
//void putZero(int m,int n,int arr[m][n,int x,int y){
	
//}
int main(){
	int m,n;
	int x=0,y=0;
	cin>>m>>n;
	int arr[m][n];
	for(int i=0;i<m;i++){
		for(int j=0;j<n;j++){
		cin>>arr[i][j];
		if(arr[i][j]==0){
			x=i;cout<<"x is:"<<x<<endl;
			y=j;cout<<"y: "<<y<<endl;
		//putZero(m,n,rr,x,y);
			for(int i=0;i<m;i++) arr[i][y]=0;
			for(int j=0;j<m;j++) arr[x][j]=0;
			//NOT AN OPTIMIZED SOLUTION!
		}
	}
	}
	
	cout<<"-------------"<<endl;
	for(int i=0;i<m;i++){
		for(int j=0;j<n;j++) 
		cout<<arr[i][j]<<" ";
		cout<<endl;
	}
	
	return 0;
}
