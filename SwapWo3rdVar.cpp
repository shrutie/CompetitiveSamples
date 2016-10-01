#include<bits/stdc++.h>
using namespace std;

int main(){
	int x,y;
	cin>>x>>y;
	x=x*y;
	y=x/y;
	x=x/y;
	cout<<"Multiplication: "<<x<<" "<<y<<endl;
	x=x^y;
	y=x^y;
	x=x^y;
	cout<<"XOR gives:(After already swapped values) "<<x<<" "<<y<<endl;
	return 0;
}
