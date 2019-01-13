#include <iostream>
#include <cstdio>
#include <cstdlib>
using namespace std;
int n;
typedef struct node {
    int data;
    struct node *next;
}slnode;

slnode *init(){
    slnode *h;
    h=(slnode *)malloc (sizeof(slnode));
    h->next=NULL;
    return h;
}


void append(slnode *h){
    if(h==NULL)
        return;
    slnode *p,*q;
    int data[50];
    printf("输入结点的个数：");
    scanf("%d",&n);
    printf("输入每个结点对应的数值域：");
    for(int i=1;i<=n;i++){
        scanf("%d",&data[i]);
    }
    p=h;
    for(int i=1;i<=n;i++){
        q=(slnode *)malloc (sizeof(slnode));
        if(q!=NULL){
            q->data=data[i];
            q->next=NULL;
            p->next=q;
            p=q;
        }
    }

}


void print(slnode *h){
    slnode *p=h->next;
    while(p!=NULL){
        printf("%d ",p->data);
        p=p->next;
    }
}

void reverseNode(slnode *h){
    if(h==NULL)
        return ;
    slnode *p=h->next;
    slnode *q;
    h->next=NULL;
    while(p!=NULL){
        q=p;
        p=p->next;
        q->next=h->next;
        h->next=q;
    }
}



int main()
{
    slnode *h;
    h=init();
    append(h);
    print(h);
    printf("\n反转后：\n");
    reverseNode(h);
    print(h);
}





























































































