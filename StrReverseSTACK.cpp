#include<bits/stdc++.h>
#include<stack>
using namespace std;

int main(){
	char str[101];
	stack<char> S;
	cin>>str;
	int n=strlen(str);
	for(int i=0;i<n;i++)
	S.push(str[i]);
	for(int i=0;i<n;i++){
	str[i]=S.top();
	S.pop();	
	}
	cout<<"Reversed String: "<<str;
	
	return 0;
}
