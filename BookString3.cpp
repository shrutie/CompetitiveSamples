#include<iostream>
#include<string>
using namespace std;
int main(){
	string s;
	int count=0;
	getline(cin,s);
//	int act;cout<<"Enter actual length now!"<<endl;
//	cin>>act;
// Actual length was not even needed here
	size_t pos = s.find(" ");
	for(pos;pos!=string::npos;pos=s.find(" ",pos))
	s.replace(pos,1,"%20");
	cout<<s;
	return 0;
	//size_t is the unsigned int representation where 
	//npos is the maximum number it can reach.
	//pos is generally used to keep hold of the count. :) Yay!
	
}
