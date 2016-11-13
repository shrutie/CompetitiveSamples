#include<bits/stdc++.h>
using namespace std;

struct Node{
	int data;
	Node* next;
};
Node* top = NULL;

void push(int n){
	Node* temp = new Node();
	temp->data=n;
	temp->next= top;
	top = temp;
}

void pop(){
	if(top == NULL) return;
	Node* temp = new Node();
	temp = top;
	top=temp->next;
	free(temp);
}
void Print(){
	Node* temp = top;
	cout<<"Stack: ";
	while(temp != NULL){
		cout<<temp->data<<" ";
		temp = temp->next;
	}
	cout<<endl;
}

int main(){
	push(2);
	push(3);
	push(5);
	push(7);Print();
	pop();Print();
	
	return 0;
}
