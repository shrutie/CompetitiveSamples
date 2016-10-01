#include<bits/stdc++.h>
using namespace std;
int main(){
	string s;
	string pat;
	getline(cin,s);
	cin>>pat;
	int len=s.length();
	if(len<pat.length()) return 0;
	for(int i=0;i<pat.length()-1;i++){
		size_t firsto=s.find_last_of(pat[i]);
		size_t lasto=s.find_first_of(pat[i+1]);
		
		if(firsto==string::npos ||lasto==string::npos||firsto>lasto)
		{cout<<"False"<<endl;
		return 0;
		}
	}
	cout<<"True";
	return 0;
}
