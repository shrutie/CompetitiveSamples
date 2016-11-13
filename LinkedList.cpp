#include<bits/stdc++.h>
using namespace std;

struct node{
	int data;
	node* next;
};
	node* head=NULL;
	
node* Insert(node* head, int val){
	node*temp = new node();
	temp->data = val;
	temp->next = head;
	head= temp;
	return head;
}
void Print(node* head){
	cout<<"Linked List: ";
	while(head != NULL){
		cout<< head->data<<" ";
		head = head->next;
	}
	cout<<endl;

}
void InsertAtN(int data, int n){
node* temp1 = new node();
temp1->data= data;
temp1->next=NULL;
if(n==1){
	temp1->next= head;
	head=temp1;
	return;
}
node* temp2= head;
for(int i=0;i<n-2;i++){
	temp2=temp2->next;
}
temp1->next= temp2->next;
temp2->next=temp1;
	
} 
void DeleteN(int n){
	node* temp1= head;
	if(n==1){
		head=temp1->next;
		delete temp1;
		return;
	}
	for(int i=0;i<n-2;i++){
		temp1=temp1->next;
	}
	node* temp2 = temp1->next;
	temp1->next = temp2->next;
	delete temp2;	
}
void DeleteVal(int data){
	node* temp1= head;
	int n=0;
	while(temp1->data!=data){
		temp1=temp1->next;
		n++;
	}
	node* temp2= head;
	for(int i=0;i<n-2;i++){
		temp2= temp2->next;
	}
	temp2->next=temp1->next;
	delete temp1;
	
}

int main(){

	int n;
	cout<<"Number of values"<<endl;
	cin>>n;
	int val;
	int pos;
	for(int i=0;i<n;i++){
		cin>>val; cin>>pos;
		InsertAtN(val,pos);
		Print(head);
	}
	cout<<"Enter the position to be deleted"<<endl;
	int pos1;
	cin>>pos1;
	DeleteN(pos1);
	Print(head);
	cout<<"Enter value to be deleted"<<endl;
	int value1;
	cin>>value1;
	DeleteVal(value1);
	Print(head);
	return 0;
}
