#include <cstdio>
#include <cstdlib>
#include <iostream>
#define MAX 6
using namespace std;

typedef struct{
    int data[MAX];
    int front;
    int rear;
}Quene;

Quene *init(){
    Quene *q=(Quene *)malloc(sizeof(Quene));
    q->front=0;
    q->rear=0;
    return q;
}

void addQuene(Quene *q,int num){
    if(q->rear==MAX){
        printf("��������\n");
        return ;
    }
    q->rear++;
    q->data[q->rear]=num;
}

int DeleteQ(Quene *q) {
    if (q->rear == q->front) {
        printf("�ն���\n");
        return NULL;
    }
    q->front++;
    return q->data[q->front];
}

void printQuene(Quene *q){
    if(q->front==q->rear){
         printf("�ӿ�\n");
        return ;
    }
    printf("��ӡ��������Ԫ�أ�\n");
    int index = q->front;
    for (int i = 0; i < (q->rear - q->front); i++) {
        index++;
        printf("%d ", q->data[index]);
    }
    printf("\n");
}


bool isEmpty(Quene *q){
    if(q->front==q->rear)
        return true;
    return false;
}

int lookFront(Quene *q){
    return (q->data[q->rear]);
}


int main()
{
    int num[10000];
    int n;
    Quene *q1,*q2;
    q1=init();
    q2=init();

    printf("������д�С��");
    scanf("%d",&n);
    for(int i=1;i<=n;i++){
        scanf("%d",&num[i]);
        addQuene(q1,num[i]);

        if(isEmpty(q2)){
            addQuene(q2,num[i]);
        }
        else{
            printf("��ͷԪ�أ�%d\n",lookFront(q2));
            int maxnum=lookFront(q2);
            if(num[i]>maxnum){

                addQuene(q2,num[i]);
            }
            else{
                addQuene(q2,maxnum);
            }
        }
    }
    printQuene(q2);
    return 0;
}














