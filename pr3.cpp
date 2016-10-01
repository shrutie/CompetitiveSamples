#include<iostream>
using namespace std;

string replace_space(string st,int n){
	
	
	for(int i=0;i<st.length();i++){
		if(char(st.at(i)) == 32)
		st.at(i)= '%';
	}
	cout<<st;	
}

int main(){
	int size;
	string st;
	cin>>st;
	cout<<"number";
	cin>>size;
	replace_space(st,size);
	return 0;
}
