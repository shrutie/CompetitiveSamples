#include<bits/stdc++.h>
using namespace std;
int main(){
	int tc;
	cin>>tc;
	if(tc>10)return 0;
	while(tc--){
	int lb,ub;
	cin >>lb>>ub;
	bool arr[ub];
	memset(arr,true,sizeof(arr));
	
	for(int p=2;p*p<ub;p++){
		if(arr[p]==true){
			for(int i=2*p;i<ub;i+=p){
				arr[i]=false;
			}
		}
	}
	for(int j=lb;j<=ub;j++){
		if(j==1)continue;
		if(arr[j]==true) cout<<j<<endl;
	}
		
	}
	return 0;
}
