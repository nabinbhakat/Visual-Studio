#include<bits/stdc++.h>
using namespace std;

struct Node
{
    int data;
    struct Node *left;
    struct Node *right;
    Node(int x){
        data=x;
        left=NULL;
        right=NULL;
    }
};

//preorder(Ro L R) 
void preorder(Node *root){
    if(root==NULL)
        return;
    cout<<root->data<<" ";
    preorder(root->left);
    preorder(root->right);
}

//inorder (L Ro R)
void inorder(Node *root){
    if(root==NULL)
        return;
    inorder(root->left);
    cout<<root->data<<" ";
    inorder(root->right);
}

//postorder(L R Ro)
void postorder(Node *root){
    if(root==NULL)
        return;
    postorder(root->left);
    postorder(root->right);
    cout<<root->data<<" ";
}

int main()
{
    struct Node *root=new Node(1);
    root->left=new Node(2);
    root->right=new Node(3);
//        1
//       / \
//       2 3
//    

    root->left->left=new Node(4);
    root->left->right=new Node(5);
//        1
//       / \
//       2 3
//      / \
//     4   5
//    
    cout<<"Postorder: ";
    postorder(root);
    cout<<"\nInorder: ";
    inorder(root);
    cout<<"\nPreorder: ";
    preorder(root);

    return 0;
}