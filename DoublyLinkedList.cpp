#include<bits/stdc++.h>
using namespace std;

struct Node{
	int data;
	Node* prev;
	Node* next;
};

Node* head;

Node* Insert(int data){
	Node* newN= new Node();
	newN->data=data;
	newN->prev=NULL;
	newN->next=NULL;
	return newN;
}
void InsertHead(int data){
	Node* newN = Insert(data);
	if(head == NULL){
		head=newN;
		return;
	}
	newN->prev = head;
	newN->next = head;
	head = newN;
}
void Print(){
	Node* temp = head;
	cout<<"Forward: ";
	while(temp!= NULL){
		cout<<temp->data<<" ";
		temp=temp->next;
	}
	cout<<endl;	
}

void PrintRev(){
	Node* temp = head;
	if(temp == NULL) return;
	while(temp->next != NULL){
		temp = temp->next;
		//cout<<":::;"<<temp->data<<":::"<<endl;
	}
	//cout<<"Debug: "<<temp->data<<endl;
	cout<<"Reverse: ";
	while(temp != NULL){
		cout<<temp->data<<" ";
		temp = temp->prev;
	}
	cout<<endl;
	
}

int main(){
	head = NULL;
	InsertHead(2); Print(); PrintRev();
	InsertHead(4);Print();PrintRev();
	InsertHead(6);Print();PrintRev();
	return 0;
}
