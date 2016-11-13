#include<bits/stdc++.h>
using namespace std;

struct node{
	int data;
	node* next;
};
node* head=NULL;

void Insert(int val){
	node* newN = new node();
	newN->data = val;
	newN->next = head;
	head= newN;
}

void InsertAtN(int val,int n){
	node* temp = new node();
	temp->data= val;
	temp->next= NULL;
	if(n==1){
		temp->next= head;
		head= temp;
		return;
	}
	node* temp1 = head;
	for(int i=0;i<n-2;i++){
		temp1=temp1->next;
	}
	temp->next= temp1->next;
	temp1->next=temp;	
}
void Print(node* head){
	if(head == NULL) return;
		cout<<head->data<<" ";
		Print(head->next);
		/*
		For reverse print
		if(head == NULL) return;
		Print(head->next);
		cout<<head->data<<" ";
		*/
		}

node* reverseList(node* head){
node *prev, *current,*next;
current = head;
prev =NULL;
while(current != NULL){
	next= current->next;
	current->next= prev;
	prev= current;
	current = next;
	}
head = prev;
return head;	
}

node* reverseRec(node* p){
if(p->next == NULL){
	//head = p;
	return p;
}	
	node* temp;
	temp =reverseRec(p->next);
	node* q = p->next;
	q->next = p;
	p->next = NULL;
	return temp;
}


int main(){
	InsertAtN(2,1);
	InsertAtN(3,2);
	InsertAtN(12,3);
	InsertAtN(4,4);
		cout<<"List is:"<<endl;
	Print(head);
	cout<<endl;
	cout<<"After reverse function"<<endl;
	head= reverseRec(head);
		cout<<"List is:"<<endl;
	Print(head);	
	return 0;
}
