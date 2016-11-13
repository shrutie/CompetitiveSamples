#include<bits/stdc++.h>
using namespace std;
int main(){
	int tc;
	cin>>tc;
	if(tc<1 ||tc>10 ) return 0;
	while (tc--){
		string s;
		cin>>s;
		int n=s.length();
		if(n<1 || n>300) return 0;
				if(n ==0){
				 cout<<"YES"<<endl;
				break;
				}
		
		for(int i=0;i<n;i++){
			if(!(int(s[i])==40 || int(s[i] ==41))) return 0;
		}
		int count=0;
		for(int i=0;i<n;i++){
		if(s[i]=='('){
			for(int j=i;j<n;j++){
				if(s[j]==')'){
				count=count+2;
				s[j]='@';
				break;
				}
			}
		}
		}
		//cout<<s<<endl;
		cout<<count<<endl;
	}
}
