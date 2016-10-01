#include<bits/stdc++.h>
using namespace std;

int main(){
	string s;
	cin>>s;
	string name;
	int len =s.length();
	for(int i=len-1;i>=0;i--){
		if(s[i] =='#'){
			string st1 = s.substr(i-2,2);
			int val = atoi(st1.c_str());
			name=name+ char(val+96);
			//cout<<"Name: "<<name<<endl;
			//cout<<char(val+96)<<" ";
			i=i-2;
			//cout<<char(val+96);			
		}
		else{
			int val = s[i] -'0';
			name=name+ char(val+96);
			//cout<<"Name: "<<name<<endl;
			//cout<<char(val+96)<<" ";
		}
	}
	for(int i=name.length()-1;i>=0;i--){
		cout<<name[i];
	}
}
