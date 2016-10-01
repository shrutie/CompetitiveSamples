#include<bits/stdc++.h>
using namespace std;
int main(){
	string s1,s2;
	int n1,n2;
	int count=0;
	cin>>s1;cin>> s2;
	n1=s1.length();
	n2=s2.length();
	for(int i=0;i<n1;i++){
		if(s2.find(s1[i])!= -1) count ++;
	}
	cout<<"The count is: "<<count<<endl;
	if(count == n1 || count == n1-1) cout<<"True"<<endl;
	else cout<<"False"<<endl;
	return 0;
}
