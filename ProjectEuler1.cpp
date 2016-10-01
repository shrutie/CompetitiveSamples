#include<bits/stdc++.h>
using namespace std;

//No NO this is completely wrong. I calculated th permutation of the number
//and added 1. It iS KIND OF HARD CODING

int factorialC(int n){
    return (n==0 || n==1)? 1: factorialC(n-1)*n; 
}

int main() {
    int n;
    cin>>n;
    if(n<1 || n>25) return 0;
   cout<< (factorialC(n)/factorialC(n-2))+1<<endl;
   return 0;
}
