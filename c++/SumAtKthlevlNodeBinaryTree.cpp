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

// finding sum of nodes at kth level using level order traversal
int findsum(node* root,int k){
    if(!root)
        return root->data;
    queue<node*> q;
    q.push(root);
    q.push(NULL);
    int level=1,sum=0;
    while(!q.empty()){
        node* temp=q.front();
        q.pop();
        if(temp!=NULL){
            if(level==k)
                sum+=temp->data;
            
            if(temp->left)
                q.push(temp->left);
            if(temp->right)
                q.push(temp->right);
        }
        else if(!q.empty()){
            q.push(NULL);
            level++;
        }
    }
    return sum;
}

// counting all the nodes using recursion
int count(node* root){
    if(!root)
        return 0;
    return (count(root->left)+count(root->right)+1);
}

//calculating sum of all the nodes using recursion
int sumall(node* root){
    if(!root)
        return 0;
    return sumall(root->left) + sumall(root->right) +root->data;
}
int main(){
    struct node *root=new node(1);
    root->left=new node(2);
    root->right=new node(3);
    root->left->left=new node(4);
    root->left->right=new node(5);
    root->right->left=new node(6);
    root->right->right=new node(7);
    cout<<"Sum at 3rd level: "<<findsum(root,3);
    cout<<"\nTotal no of nodes: "<<count(root);
    cout<<"\nSum of all nodes: "<<sumall(root);
    return 0;
}
