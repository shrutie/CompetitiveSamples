#include<bits/stdc++.h>
using namespace std;

int main(){
	string time;
	cin>>time;
	int n= time.length();
		int hr = atoi(time.substr(0,2).c_str());
		int min = atoi(time.substr(3,2).c_str());
		int sec = atoi(time.substr(6,2).c_str());
		string st = time.substr(n-2,2);
		if(st=="PM" && hr !=12) hr= hr+12;
		if(st=="AM" && hr ==12) hr=0;
		cout<<setfill('0')<<setw(2)<<hr<<":"<<setfill('0')<<setw(2)<<min<<":"<<setfill('0')<<setw(2)<<sec;		
		//setfill is set to space by default and setw is the width to be allocated.Yay
    return 0;
}

