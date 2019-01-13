/* 面试题25：合并两个排序的链表
题目：输入两个递增排序的链表，合并这两个链表并使新链表中的结点仍然是按
照递减排序的。*/
#include <iostream>
#include <cstdio>
#include <cstdlib>
using namespace std;                     //因为保持递增有序，只能采用尾插法
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

slnode * Meger(slnode *h1,slnode *h2){
    if(h1==NULL)
        return h2;
    else if(h2==NULL)
        return h1;
    else if(h1==NULL && h2==NULL)
        return NULL;

    slnode *p,*q,*s;
    p=h1->next;
    q=h2->next;

    slnode *h3=h1;
    h3->next=NULL;
    free(h2);

    while(p&&q){
        if(p->data<q->data){
            s=p;
            p=p->next;
        }
        else{
            s=q;
            q=q->next;
        }
        s->next=h3->next;
        h3->next=s;
    }
    if(p==NULL)
        p=q;
    while(p){
        s=p;
        p=p->next;
        s->next=h3->next;
        h3->next=s;
    }
    return h3;
}


int main()
{
    slnode *h1,*h2;
    h1=init();
    h2=init();
    append(h1);
    append(h2);
    printf("合并之后：\n");
    slnode *ans=Meger(h1,h2);
    print(ans);
}
















