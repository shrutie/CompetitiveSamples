#include<bits/stdc++.h>
using namespace std;
int main(){
	int n_b,n_g,m;
	int s_boys[n_b],s_girls[n_g];
	int rep=0;
	cin>>n_b;
	cin>>n_g;
	for(int i=0;i<n_b;i++)
	cin>>s_boys[i];
	for(int i=0;i<n_g;i++)
	cin>>s_girls[i];
	cin>>m;
	prod[n_b];
	
	for(int i=0;i<n_b;i++){
		prod[i]= s_boys[i] * s_girls[i];
		rep = rep + prod[i];
	}
	
		int maxm= prod[0];
		int key;
		for(int i=1;i<n;i++){
			if(prod[i]>maxm) {maxm = prod[i];
			
		}
	
	if(rep<0) cout<<rep+m;
	else if(rep >0 || rep ==0){
	
	}
	return 0;
}
