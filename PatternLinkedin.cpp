#include<bits/stdc++.h>
using namespace std;
int main(){
	int n;
	cin>>n;
	for(int i=1;i<=n;i++){
		for(int j=n-1;j>=i;j--){
			cout<<" ";
		}
		int x=i;
		for(x=1;x<i;x++)
		cout<<"#";
		cout<<endl;
	}
}
