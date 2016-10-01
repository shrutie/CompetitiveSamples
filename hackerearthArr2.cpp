#include<iostream>
using namespace std;

int main(){
	
	int m,n;
	cin>>m >> n;
	if(m>10 && n>10) return 0;
	int arr[10][10];
	
	for(int i=0;i<m;i++){
		for(int j=0;j<n;j++){
			cin >>arr[i][j];
		}
	}
	for(int i=0;i<n;i++){
		for(int j=0;j<m;j++){
			cout<<arr[j][i]<<" ";
		}
		cout<<endl;
	}
	
	return 0;

}
