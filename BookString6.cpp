#include<bits/stdc++.h>
using namespace std;
int main(){
	string s;cin>>s;
	int n1=s.length();
	string st;
	int*letter=new int[128];
	for(int i=0;i<n1;i++){
		int val = int(s[i]);
		letter[val]++;
		//st=st+st[i]+to_string(letter[val]);
	/*	ostringstream stream;
		stream << letter[val];
		string inbtw=stream.str();
		st=st+ s[i];
		st=st + inbtw; */
	}
	
	int i=0;
	while(s[i]){
		int val = int(s[i]);
		if(letter[val]> 0 && val>60 && val<123 ){
		cout<< s[i]<<letter[val];
		letter[val]=0;
		}
		i++;	
	}
	return 0;
}
