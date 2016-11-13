#include<bits/stdc++.h>
#define inta long long
using namespace std;
int main(){
	int tc;
	cin>>tc;
	while(tc--){
		int n;
		cin>>n;
        if(n<1 || n>100000) return 0;
		int bribe=0;
		int *arr=new int[n];
		for(int i=1;i<=n;i++) cin>>arr[i];
		for(int i=n;i>=1;i--){
			if(arr[i] == n){
				if((n-i) >2){
				cout<<"Too chaotic"<<endl;
				return 0;
			}
				bribe = bribe+ (n-i);
				i = n-i;
				n=i;
			}
		}
		cout<<bribe<<endl;
	}
}
