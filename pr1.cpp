#include<iostream>
#include<string.h>
using namespace std;

int uniquec(string st){
int *charset = new int[128];
	
		for(int i=0;i<st.length();i++){
			int val = st.at(i);
			if(charset[val]){
			cout<< "Not Unique";
			return 0;}
			else
			charset[val] = -1;
		}
		cout<<"Unique";
	
}


int main(){
	string st;
	cout<<"Enter string";
	cin>> st;
	uniquec(st);
	return 0;
}
