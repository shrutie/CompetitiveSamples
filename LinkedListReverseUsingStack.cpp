#include<bits/stdc++.h>
#include<stack>
using namespace std;

struct Node{
	int data;
	Node* next;
};
Node* head=NULL;

void Insert(int data){
	Node* newN = new Node();
	newN->data = data;
	newN->next=head;
	head = newN;	
}
void Print(){
	if(head == NULL) return;
	Node* temp = head;
	cout<<"Linked List: ";
	while(temp != NULL){
		cout<<temp->data<<" ";
		temp= temp->next;
		}
		cout<<endl;
}
void Reverse(){
	if(head == NULL) return;
		stack<Node* > S;
	Node* temp = head;
	while(temp != NULL){
		S.push(temp);
		temp= temp->next;
	}
	Node *temp1= S.top();
	head = temp1;
	S.pop();
	while(!S.empty()){
	temp1->next= S.top();
	S.pop();
	temp1 = temp1->next;	
	}
	temp1->next = NULL;
	
}

int main(){

	Insert(5);
	Insert(4);
	Insert(66);
	Insert(51);
	Insert(8);
	Print();
	Reverse();
	cout<<"After reversal:"<<endl;
	Print();
	
	return 0;
}
