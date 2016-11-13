#include<bits/stdc++.h>
using namespace std;
struct BstNode{
	int data;
	BstNode* left;
	BstNode* right;
};

BstNode* GetNode(int data){
	BstNode* newN =new BstNode();
	newN->data=data;
	newN->left = newN->right=NULL;
}

BstNode* Insert(BstNode* root, int data){
	if(root==NULL){
		root = GetNode(data);
	//	return root;
	} 
	else if(root->data >= data) root->left = Insert(root->left,data);
	else root->right= Insert(root->right,data);
	return root;
}

int main(){
	BstNode* root =NULL;
	root= Insert(root,15);
	root= Insert(root,25);
	root= Insert(root,65);
	return 0;
}
