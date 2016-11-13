#include<bits/stdc++.h>
#include<queue>
using namespace std;
struct BstNode{
	char data;
	BstNode* left;
	BstNode* right;
};

BstNode* getNode(char data){
	BstNode* rootN =new BstNode();
	rootN->data=data;
	rootN->left=rootN->right=NULL;
	return rootN;
}

BstNode* Insert(BstNode* root,char data){
	if(root ==NULL){
		root = getNode(data);
	}
	else if(root->data >= data) root->left =Insert(root->left,data);
	else root->right =Insert(root->right,data);
	return root;
}
void LevelOrder(BstNode* root){
	if(root == NULL) return;
	queue<BstNode*> Q;
	Q.push(root);
	while(!Q.empty()){
		BstNode* curr=Q.front();
		cout<<curr->data<<" ";
		if(curr->left != NULL) Q.push(curr->left);
		if(curr->right != NULL) Q.push(curr->right);
		Q.pop();
	}
}

int main(){
	BstNode* root =NULL;
	root=Insert(root,'F');
	root=Insert(root, 'D');
	root=Insert(root,'J');
	root=Insert(root,'B');
	root=Insert(root, 'E');
	root=Insert(root,'G');
	root=Insert(root,'K');
	root=Insert(root,'A');
	root=Insert(root,'C');
	root=Insert(root,'I');
	root=Insert(root,'H');
	LevelOrder(root);
	return 0;
}
