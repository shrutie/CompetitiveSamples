#include<iostream>
#include<string>
using namespace std;
int main(){
	string s;
	cin>>s;
	int count0 = s.find("0");
	int count1 = s.find("1");
	if(count0 == 1 ||count1 ==1)cout<<"Yes"; 
	else cout<<"No";  
	return 0;
}
