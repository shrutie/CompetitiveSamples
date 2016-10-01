#include<bits/stdc++.h>
using namespace std;
int main(){
	int letter[128];
	int count=0;
	memset(letter,0,sizeof(letter));
	string s;
	getline(cin,s);
	int j=0;
	while(s[j]){
		s[j]=tolower(s[j]);
		j++;
	}
	
	for(int i=0;i<s.length();i++){
		int val = int(s[i]);
	//	cout<<val<<"---"<<endl;
		letter[val]++;
	//	cout<<letter[val]<<" for "<<s[i]<<endl;
	}
	for(int i=0;i<s.length();i++) {
		if(s[i]==' ') i++;
	    else if(letter[int(s[i])]% 2!=0){
		 count++; //cout<<"Odd number count for: "<< s[i]<<count<<endl;
		}
	}
	
	if(count==1) cout<<"True";
	else if(count>1) cout<<"False"<<endl;
	return 0;
}
