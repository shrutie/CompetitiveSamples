#include<iostream>
using namespace std;

void fizzbuzz(int t){
	while(t--){
	int n;
		cin >> n;
		for(int i=1;i<=n;i++){
			
			if(i %3 == 0) cout<<"Fizz"<<endl;
			else if(i%5 == 0) cout<<"Buzz"<<endl;
			else if(i%3 && i%5 ==0) cout<<"FizzBuzz"<<endl;
			else
			cout<< i<<endl;
		}
		
	}
}


int main(){
	int tc;
	cin >> tc;
	fizzbuzz(tc);
	return 0;
}
