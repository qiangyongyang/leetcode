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
	1.��������ߺ����������ҵ����ڵ㡣
	2.���ݸ��ڵ㣬��֮�ֳ����������֡�
	3.�ѷֳɵ����������֣���ȥ������ߺ����������Ҹ��ڵ�
*/
void Pre_In_Create(int pre[],int in[], int i,int j,int k,int h,BiTree *bt){
    int m;
    bt=(BiTree *)malloc(sizeof(BiTree));
    bt->data=pre[i];


    m=k;
    while(in[m]!=pre[i]){
        m++;
    }

    if( m == k ){               //���ڵ����������еĵ�һ���ڵ㣬����������
        bt->lchild==NULL;
    }
    else{
        Pre_In_Create(pre,in,  i+1,i-k+m,   k,m-1,   bt->lchild);
    }




    if(m == h ){               //���ڵ����������е����һ���ڵ㣬����������
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







































































