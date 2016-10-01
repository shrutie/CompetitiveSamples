#include<bits/stdc++.h>
using namespace std;

// Counts occurences bot doesnt maintain order as asked
// in the question originally

int main(){
int n;
int first,last,j;
int sum=0;
n=7;
int arr[7]={2,3,4,1,1,2,3};
//for(int i=0;i<n;i++) cin>>arr[i];
sort(arr,arr+n);

for(int i=0;i<n;i++) cout<<arr[i]<<" ";
for(int i=0;i<n;i++){
	first=i;
	j=i;
	while(arr[j]==arr[j+1]) j++;
	last=j;
	cout<<"i:"<<i<<" "<<endl;
	sum += (last-first);
	cout<<"Sum for:"<<arr[i]<<" is:"<<sum<<endl;
		i=last;
}
cout<<sum;
}
