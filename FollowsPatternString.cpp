#include<bits/stdc++.h>
using namespace std;
int main(){
	string s;
	string pat;
	int pos=0;
	getline(cin,s);
	cout<<"Pattern: ";
	cin>>pat;
	for(int i=pat.length();i>0;i--){
		if(s.find(pat[i-1])<s.find(pat[i]))
		pos++;
		else pos--;
	}
	if(pos>0)cout<<"True"<<endl;
	else cout<<"False";
	return 0;
}
