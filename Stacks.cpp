#include<bits/stdc++.h>
using namespace std;
#define maxv 101
int arr[maxv];
int top =-1;

void push(int data){
	if(top == maxv-1){
		cout<<"Stack Overflow"<<endl;
		return;
	}
	top++;
	arr[top] = data;
}
 void pop(){
 	if(top == -1){
 		cout<<"Stack underflow"<<endl;
 		return;
	 }
 	top--;
 }
 void Print(){
 	for(int i=0;i<=top;i++) cout<<arr[i]<<" ";
 	cout<<endl;
 }

int main(){
	push(2);
	push(3);
	push(4);
	push(5); Print();
	pop();Print();
	
	return 0;
}
