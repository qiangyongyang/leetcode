#include <cstdio>
#include <cstdlib>
using namespace std;
int n;
typedef struct node
{
    int  data;
	struct node *next;
}slnode;
slnode *init(){
    slnode *h;
    h=(slnode *)malloc(sizeof(slnode));
    h->next=NULL;
    return h;
}



int append(slnode *h){
    slnode *p,*q;
    int num[100];
    printf("输入节点的个数：");
    scanf("%d",&n);
    printf("输入每个节点对应的数值：");
    for(int i=1;i<=n;i++){
        scanf("%d",&num[i]);
    }
    p=h;
    for(int i=1;i<=n;i++){
        q=(slnode *)malloc(sizeof(slnode));
        if(q!=NULL){
            q->data=num[i];
            q->next=NULL;
            p->next=q;
            p=q;
        }
    }
    return 1;
}

void print(slnode *h){
    slnode *p=h->next;
    while(p!=NULL){
        printf("%d  ",p->data);
        p=p->next;
    }
}

void searchNode(slnode *h,int k){
    if(h->next==NULL || k<=0 || k>n){             //这个代码关系到offer的发放
        printf("error");
        return ;
    }


    slnode *p=h->next;
    slnode *q=h->next;
    for(int i=1;i<k;i++){
        p=p->next;
    }

    while(p->next!=NULL){
        p=p->next;
        q=q->next;
    }
    printf("%d\n",q->data);
}



int main()
{
    int k;
    slnode *h;
    h=init();
    append(h);
    print(h);
    printf("\n");
    while(1){
        scanf("%d",&k);
        searchNode(h,k);
    }
    return 0;
}










