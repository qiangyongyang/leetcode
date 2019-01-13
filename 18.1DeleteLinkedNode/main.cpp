/*void DeleteNode(slnode *h,slnode *todelete){
    if(todelete->next!=null){          //ɾ���м��   O(1)
        slnode *pnext=todeiete->next;
        todelete->data=pnext->data;
        todelete->next=pnext->next;
        free(pnext);
    }

    else{             //β�ڵ�     O(n)
        slnode *pre =h;
        while(pre->next!=todelete){
            pre=pre->next;
        }

        pre->next=null;

    }
}
*/







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
    printf("����ڵ�ĸ�����");
    scanf("%d",&n);
    printf("����ÿ���ڵ��Ӧ����ֵ��");
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


void  deleteNode(slnode *h,slnode *toDelete){
    if(toDelete->next!=NULL){
        slnode *pNext=toDelete->next;
        if(pNext!=NULL){
            toDelete->data=pNext->data;
            toDelete->next=pNext->next;
            free(pNext);
        }
    }
    else if(h==toDelete){
        free(toDelete);
    }
    else{
        slnode *p=h;
        while(p->next!=toDelete){
            p=p->next;
        }
        p->next=NULL;
        free(toDelete);
    }
}

int main()
{
    int index;
    slnode *h;
    h=init();
    append(h);
    print(h);
    printf("\n");

    slnode *toDelete;
    toDelete=h->next->next->next;
    printf("ɾ����:\n");
    deleteNode(h,toDelete);
    print(h);
}









































































