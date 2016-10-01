#include<iostream>
using namespace std;
int main(){
	int n,win;
	int temp=0;
	cin>>n;
	cout<<"Enter window size"<<endl;
	cin>>win;
	int *arr=new int[n];
	for(int i=0;i<n;i++) cin>>arr[i];
	for(int i=0;i<n;i=i+win){ //i=i+2*win when alternate subarrays are to be altered
	int	x=i;
	int	y=min(i+win-1,n-1);
	while(x<y) swap(arr[x++],arr[y--]);
	}
	for(int i=0;i<n;i++) cout<<arr[i]<<" ";
	return 0;
}
