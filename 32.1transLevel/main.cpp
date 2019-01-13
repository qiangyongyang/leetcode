#include <iostream>
#include <cstdio>
#include <cstdlib>
#include <stack>
#include <queue>
using namespace std;
//1 2 4 -1 -1 5 -1 -1 3 6 7 -1 -1 8 -1 -1 -1
typedef struct BitNode{
    int data;
    struct BitNode *lchild;
    struct BitNode *rchild;
}BitNode,*BiTree;

BiTree CreateBinTree(){
    BiTree t;
    int num;
    scanf("%d",&num);
    if(num == -1){
        t = NULL;
    }
    else{
        t=(BitNode *)malloc(sizeof(BitNode));
        t->data = num;
        t->lchild = CreateBinTree();
        t->rchild = CreateBinTree();

    }
    return t;
}



void  PreOrder(BiTree bt){
    if(bt != NULL){
        printf("%d ",bt->data);
        PreOrder(bt->lchild);
        PreOrder(bt->rchild);
    }
}


void PreOrderWithoutLoop(BiTree bt){
    stack <BiTree> s;
    BiTree p = bt;
    while(p != NULL || !s.empty()){
       while(p != NULL){
            printf("%d ",p->data);
            s.push(p);
            p=p->lchild;
       }
       if(!s.empty()){
            p=s.top();
            s.pop();
            p=p->rchild;
        }
    }

}



void InOrder(BiTree bt){
    if(bt != NULL){
        InOrder(bt->lchild);
        printf("%d ",bt->data);
        InOrder(bt->rchild);
    }
}



void InOrderWithoutLoop(BiTree bt){
    stack <BiTree> s;
    BiTree p=bt;
    while(p != NULL || !s.empty()){
        while(p != NULL){
            s.push(p);
            p=p->lchild;
        }

        if(!s.empty()){
            printf("%d ",p->data);
            p=s.top();
            s.pop();
            p=p->rchild;
        }
    }
}


void PostOrder(BiTree bt){
    if(bt != NULL){
        PostOrder(bt->lchild);
        PostOrder(bt->rchild);
        printf("%d ",bt->data);
    }
}



void PostOrderWithoutLoop(BiTree bt){
    stack <BiTree> s;
    BiTree cur;            //当前节点
    BiTree pre=NULL;            //前一次访问结点
    s.push(bt);
    while(!s.empty()){
        cur=s.top();
        if((cur->lchild == NULL && cur->rchild == NULL) || (pre != NULL && (pre==cur->lchild || pre == cur->rchild))){
            printf("%d ",cur->data);
            s.pop();
            pre=cur;
        }
        else{
            if(cur->rchild!=NULL){
                s.push(cur->rchild);
            }
            if(cur->lchild!=NULL){
                s.push(cur->lchild);
            }
        }
    }
}



void transLevel(BiTree bt){
    queue <BiTree> q;

    if(!bt){
        return ;
    }

    q.push(bt);

    while(!q.empty()){
        BiTree p=q.front();
        printf("%d ",p->data);
        if(p->lchild != NULL){
            q.push(p->lchild);
        }
        if(p->rchild != NULL){
            q.push(p->rchild);
        }
        q.pop();
    }
}


int main(){
    BiTree bt;
    bt=CreateBinTree();

    printf("层次遍历为：\n");
    transLevel(bt);
    printf("\n");
}












