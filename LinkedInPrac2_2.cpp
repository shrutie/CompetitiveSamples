#include<bits/stdc++.h>
using namespace std;

//Well It works but took a lot of time while passing the testcases!

bool PowerOf2(int n){
	return (n && !(n&(n-1)));
}
int main(){
	int tc;
	unsigned long long n;
	cin>>tc;
	if(tc<1 || tc>10) return 0;
	int track_person=1;
	while(tc--){
			cin>>n;
			if(n<1 || n>((2^64)-1)) return 0;
		while(n!=1){
			if(PowerOf2(n)==true){
			n=n/2;
			track_person++;
			}
		else{
			int val=n-1;
			while(!PowerOf2(val)){
				val--;
			}
		//	cout<<"value"<<val<<endl;
			n=n-val;
			//cout<<"The next power: "<<n<<endl;
			track_person++;
		}
			//cout<<"Person is:"<<track_person<<endl;	
		}
			if((track_person%2)==0) cout<<"Lousie";
			else cout<<"Richard";
			cout<<endl;
		
	}
	return 0;
}
