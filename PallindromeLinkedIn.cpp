#include<bits/stdc++.h>
using namespace std;
int main(){
	string st="linkedinnideknil";
	string s;
	cin>>s;
	int count=0;
	for(int i=0;i<s.length();i++){
		if(s[i]!= st[i]){
			s.replace(i,1,std::string(1,st[i]));
			count++;
		}
	}
	cout<<count;
	return 0;
}
