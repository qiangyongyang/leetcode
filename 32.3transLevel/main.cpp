#include <cstdio>
#include <cstdlib>
#include <stack>
#include <queue>
#include <iostream>
using namespace std;
//1 2 4 -1 -1 5 -1 -1 3 6 7 -1 -1 8 -1 -1 -1
typedef struct BitNode{
    int data;
    struct BitNode *lchild;
    struct BitNode *rchild;
}BitNode,*BiTree;

BiTree createBinTree(){
    BiTree bt;
    int num;
    scanf("%d",&num);
    if(num == -1)
        bt = NULL;
    else{
        bt=(BitNode *)malloc(sizeof(BitNode));
        bt->data=num;
        bt->lchild=createBinTree();
        bt->rchild=createBinTree();
    }
    return bt;
}


void transLevel(BiTree bt){
    if(!bt){
        return ;
    }
    vector <int>temp;
    queue <BiTree> q;
    bool evevn=false;

    q.push(bt);
    BiTree fr;
    while(!q.empty()){
        int len=q.size();
        temp={};
        for(int i=0;i<len;i++){            // 用队列的 size 来决定这层有多少元素
            fr=q.front();
            q.pop();
            temp.push_back(fr->data);
            if(fr->lchild){
                q.push(fr->lchild);
            }
            if(fr->rchild){
                q.push(fr->rchild);
            }
        }
        if(evevn){
            std::reverse(temp.begin(), temp.end());
        }
        evevn=evevn;
        for(int m = temp.begin(); m != temp.end(); m++){
            printf("%d ",*m);
        }
    }

}


int main()
{
    BiTree bt;

    bt=createBinTree();

    printf("之字遍历为：\n");
    transLevel(bt);
    printf("\n");

    return 0;
}











































