#include<stdio.h>
#include <stdlib.h>
struct Node{
    int data;
    struct Node *left;
    struct Node *right;
};
struct Node *deletedata(struct Node *root,int data){
    if(root==NULL){
        return root;
    }
    else if(data<root->data){
        root=deletedata(root->left,data);
    }
    else if(data>root->data){
        root=deletedata(root->right,data);
    }
    else{
        if(root->left==NULL){
            struct Node *temp=root->right;
            free(root);
            return temp;
        }
        else if(root->right==NULL){
            struct Node *temp=root->left;
            free(root);
            return temp;
        }
        else{
            struct Node *t1=root;
            struct Node *t2=root->right;
            while(t2->left!=NULL){
                t1=t2;
                t2=t2->left;
            }
            root->data=t2->data;
            if(t1==root){
                t1->right=t2->right;
            }
            else{
                t1->left=t2->right;
            }
            return root;
        }
    }
}
void levelhelper(struct Node *root,int level){
    if(root==NULL){
        return;
    }           //github.com/Anand-29/MIT-Pune
    if(level==1){
        printf("%d ",root->data);
    }
    else{
        levelhelper(root->left,level-1);
        levelhelper(root->right,level-1);
    }
}
int height(struct Node *root){
    if(root==NULL){
        return 0;
    }
    int l=1+height(root->left);
    int r=1+height(root->right);
    return (l>r)?l:r;
}
void printlevel(struct Node *root){
    int h=height(root);
    for(int i=1;i<=h;i++){
        for(int j=i;j<=h;j++){
            printf(" ");
        }
        levelhelper(root,i);
        printf("\n");
    }
}
struct Node *insert(struct Node *root,int data){
    if(root==NULL){
    struct Node *newnode=(struct Node*)malloc(sizeof(struct Node));
    newnode->data=data;
    newnode->left=NULL;
    newnode->right=NULL;
    return newnode;
    }
    else if(data<root->data){
        root->left=insert(root->left,data);
    }
    else if(data>root->data){
        root->right=insert(root->right,data);
    }
    return root;
}
int main(){
    struct Node *root=NULL;
    root=insert(root,5);
    root=insert(root,3);
    root=insert(root,4);
    root=insert(root,2);
    root=insert(root,1);
    root=insert(root,7);
    root=insert(root,6);
    root=insert(root,9);
    printlevel(root);
    root=deletedata(root,5);
    printf("After deleting 5:-\n");
    printlevel(root);
}