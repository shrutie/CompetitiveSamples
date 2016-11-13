#include<bits/stdc++.h>
using namespace std;

int main(){
    int n;
    int k;
    int q;
    cin >> n >> k >> q;
    vector<int> a(n);
    for(int a_i = 0;a_i < n;a_i++){
       cin >> a[a_i];
    }
    //rotation logic
    for(int ii=0;ii<k;ii++){
    	for(int i=1;i<=n;i++){
    		a[i]=a[i-1];
		}	
		
	}
    for(int a0 = 0; a0 < q; a0++){
        int m;
        cin >> m;
    }
    return 0;
}

