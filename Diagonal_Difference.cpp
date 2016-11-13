#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main(){
    int n;
    cin >> n;
    int sum_prim=0;
    int sum_sec=0;
    vector< vector<int> > a(n,vector<int>(n));
    for(int a_i = 0;a_i < n;a_i++){
       for(int a_j = 0;a_j < n;a_j++){
          cin >> a[a_i][a_j];
           if(a_i==a_j)
               sum_prim+=a[a_i][a_j];
       }
    }
    cout<<sum_prim<<endl;
    int j=n-1;
    for(int i=0;i<n;i++){
    	sum_sec +=a[i][j];
    	j--;

    }
    cout<<"Secondary: "<<sum_sec<<endl;
   cout<<abs(sum_prim-sum_sec);
    return 0;
}

