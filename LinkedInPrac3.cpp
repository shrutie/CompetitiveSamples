#include<bits/stdc++.h>
using namespace std;
/*
Xor of all contiguous subarrays:
If N==even ; 0
else N==odd;xor(arr[even... pos])
*/
typedef long ll;
int main(){
int tc;
ll n;
cin>>tc;
//if(tc<1 || tc >5) return 0;
while(tc--){
cin>>n;
	ll res =0;
//if(n<2 || n> pow(10,5)) return 0;
	ll *arr=new ll[n];
	for(ll i=0;i<n;i++){
		cin>>arr[i];
		if(i%2 == 0) res=res^arr[i];
	//	if(arr[i]< 1 || arr[i] > pow(10,8)) return 0;
	}
	if(n%2 ==0) cout<<"0"<<endl;
	else cout<<res<<endl;		
	}	
return 0;
}
