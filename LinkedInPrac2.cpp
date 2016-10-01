#include<bits/stdc++.h>
using namespace std;
size_t popcount(size_t n) {
    std::bitset<sizeof(size_t) * CHAR_BIT> b(n);
    return b.count();
}
int main(){
	int tc;
	unsigned long long n;
	cin>>tc;
	if(tc<1 || tc>10) return 0;
	while(tc--){
		cin>>n;
		cout<<(popcount(n-1) & 1?"Lousie":"Richard")<<endl;
	}
	return 0;
}
