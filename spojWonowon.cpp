#include<iostream>
#define ll long long int 
using namespace std;
int main(){
	int inp,flag=0;
	cin>>inp;
	//if(inp<3 ||inp>10000)return 0;
	ll x=101;
	for(ll i=3;i<inp;i++){
		x=x*100+1;
		cout<<"In loop x is"<<x<<endl;
		if(x%i==0)
		flag++;
	}
	cout<<flag;
	return 0;

}
