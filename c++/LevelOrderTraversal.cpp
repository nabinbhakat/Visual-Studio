#include<bits/stdc++.h>
using namespace std;
struct node
{
    int data;
    node* left;
    node* right;
    node(){
        data=0;
        left=NULL;
        right=NULL;
    }
    node(int x){
        data=x;
        left=NULL;
        right=NULL;
    }
};

//using queue
void levelorder(node* root){
    if(!root)
        return;
    queue<node*> q;
    q.push(root);
    // q.push(NULL);
    while(!q.empty()){
        node* temp=q.front();
        q.pop();
        cout<<temp->data<<" ";
        if(temp->left){
            q.push(temp->left);
        }
        if(temp->right){
            q.push(temp->right);
        }
    }
}

int main(){
    struct node *root=new node(1);
    root->left=new node(2);
    root->right=new node(3);
    root->left->left=new node(4);
    root->left->right=new node(5);
    root->right->left=new node(6);
    root->right->right=new node(7);
    cout<<"Level Order Traversal: ";
    levelorder(root);
    return 0;
}
