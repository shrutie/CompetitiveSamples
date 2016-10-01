#include<iostream>
#include<math.h>
#include<iomanip>
using namespace std;
int main(){
	int tc;
	cin>> tc;
	while(tc--){
		double a,b,c,cc,bb,aa;
		double A=0,B=0,C=0;
		double vol=0;
		double in=0;
		cin >>a>>b>>c>>cc>>bb>>aa;
		if(a>1000 ||b>1000 ||c>1000 ||cc>1000 ||bb>1000 ||aa > 1000) return 0;
		
		A=b*b + c*c -aa*aa;
		B=c*c+ a*a - bb*bb;
		C=a*a +b*b - cc*cc;
		in=4*a*a*b*b*c*c - a*a*A*A -b*b*B*B -c*c*C*C +A*B*C;
		vol =(sqrt(in)/12);
		cout<<setprecision(4)<<fixed<<vol<<endl;
		
	}
	return 0;
}
