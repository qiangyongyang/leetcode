#include <cstdio>
#include <iostream>
#include <cstdlib>
#include <queue>
using namespace std;
//1 2 4 -1 -1 5 -1 -1 3 6 7 -1 -1 8 -1 -1 -1
/*
                1
              /   \
             2     3
            / \   /
           4   5 6
                / \
               7  8
*/
typedef struct BitNode{
    int data;
    struct BitNode *lchild;
    struct BitNode *rchild;
}BitNode,*BinTree;

BinTree CreateBinTree(){
    BinTree bt;
    int num;
    scanf("%d",&num);
    if(num == -1){
        bt = NULL;
    }
    else{
        bt=(BitNode *)malloc(sizeof(BitNode));
        bt->data=num;
        bt->lchild=CreateBinTree();
        bt->rchild=CreateBinTree();
    }
    return bt;
}


void transLevel(BinTree bt){
    queue <BinTree> q;
    BinTree p;
    if(!bt){
       return;
    }
    q.push(bt);

    int nextLevel=0;       //��һ������
    int toBePrinted=1;    //��ǰ��㻹δ��ӡ�Ľ����

    while(!q.empty()){
        p=q.front();
        printf("%d ",p->data);
        if(p->lchild != NULL){
            nextLevel++;
            q.push(p->lchild);
        }
        if(p->rchild != NULL){
            nextLevel++;
            q.push(p->rchild);
        }

        q.pop();
        toBePrinted--;
        if(toBePrinted == 0){
            printf("\n");
            toBePrinted=nextLevel;
            nextLevel=0;
        }
    }
}


int main()
{
    BinTree bt;
    bt=CreateBinTree();

    printf("��α���Ϊ��\n");
    transLevel(bt);
    printf("\n");
}












