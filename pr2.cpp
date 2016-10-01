#include<iostream>
#include<string.h>
#include<algorithm>
using namespace std;

void check_permutation(string str1,string str2){
	
	std::sort (str1.begin(),str1.end());
	std:: sort(str2.begin(),str2.end());
	if(int val = str1.compare(str2) == -1) cout<< "false";
	else
	cout<<"true";
}


int main(){
	string st1,st2;
	cin>>st1>>st2;
 check_permutation(st1,st2);
	return 0;
}
