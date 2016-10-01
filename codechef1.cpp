
#include<iostream>
#include<string>
using namespace std;

int main(){
		int tc;
		cin >> tc;
		string pat;
		char ch1,ch2;
	while(tc --){
				cin>> pat;
				int n=pat.size();
				int flag =0;
				ch1=pat[0];ch2=pat[1];
				if(ch1==ch2) cout<<"NO"<<endl;				
				else{
					
					for(int i=2;i<pat.length();i++){
			
					if((i%2==0) && (pat[i]!=ch1)){
					flag=1;
					break;
					}
					
					else if((i%2!=0) && (pat[i] !=ch2)){
						flag =1;
						break;
					}	
					}
					if(flag)
					cout<<"NO"<<endl;
					else
					cout<<"YES"<<endl;
				}

	}
	
	return 0;
}
	
