#include<iostream>
using namespace std;
int main(){
	int n,count=0;
	int cur_max=0,new_max=0;
	int val;
	cin >>n;
	int *arr=new int[n];
	for(int i=0;i<n;i++){cin >>arr[i];	if(arr[i]==0) count ++;}
	for(int i=0;i<n;i++){
		
		if(arr[i]==0){ val = -1;cur_max=0;}
		else val = 1;
		 cur_max=max(val,val+cur_max);
		 new_max=max(cur_max,new_max);
		
	}
	new_max=max(0,new_max);
	cout<< new_max<<endl;
	cout<< count +new_max;
	return 0;
}
