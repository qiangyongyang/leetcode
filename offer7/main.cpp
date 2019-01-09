#include <cstdio>
#include <cstdlib>
int pre[11000]={1,2,4,7,3,5,6,8};
int in[10000]={4,7,2,1,5,3,8,6};


typedef struct BiTNode{
    int data;
    struct BiTNode *lchild;
    struct BiTNode *rchild;
}BiTNode,*BiTree;
/*
	1.在先序或者后序序列中找到根节点。
	2.根据根节点，将之分成左右两部分。
	3.把分成的左右两部分，再去先序或者后序序列中找根节点
*/
void Pre_In_Create(int pre[],int in[], int i,int j,int k,int h,BiTree *bt){
    int m;
    bt=(BiTree *)malloc(sizeof(BiTree));
    bt->data=pre[i];


    m=k;
    while(in[m]!=pre[i]){
        m++;
    }

    if( m == k ){               //根节点是中序序列的第一个节点，则无左子树
        bt->lchild==NULL;
    }
    else{
        Pre_In_Create(pre,in,  i+1,i-k+m,   k,m-1,   bt->lchild);
    }




    if(m == h ){               //根节点是中序序列的最后一个节点，则无右子树
        bt->rchild ==NULL;
    }
    else{
        Pre_In_Create(pre,in,   i-k+m+1,j,    m+1,h,     bt->rchild);
    }
}



int main()
{
    Bitree *bt;
    Pre_In_Create(pre,in, 0 ,7 0 ,7,bt);
}







































































