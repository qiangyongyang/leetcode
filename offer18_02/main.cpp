

#include <stdio.h>
#include <stdlib.h>
typedef int datatype;

typedef struct node
{
	datatype data;
	struct node *next;
}slnode;
/*��ʼ��*/
slnode *initiate(){
    slnode *h;
    h=(slnode *)malloc(sizeof(slnode));
    h->next=NULL;
    return h;
}



/*����������*/
int append (slnode *h)
{
	slnode *p,*q;
	int n;         /* n ������������Ľ����*/
	int a[10];       /* a �����������������*/
	if(h==NULL)
	{
		printf("������δ��ʼ����\n");
		return 0;
	}
	printf("�����뵥��������Ľ����n=");
	scanf("%d",&n);
	printf("�������������������ֵ:");
	for(int i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}
	p=h;
	for(int i=0;i<n;i++){
        q=(slnode *)malloc(sizeof(slnode));
        if(q!=NULL){
            q->data=a[i];
            q->next=NULL;
            p->next=q;
            p=q;
        }
	}
	return 1;
}

/*ɾ���ظ��ڵ�*/
void DeletechongfuNode(slnode* pHead)
{
    if(pHead == NULL)
        return;

    slnode* pPreNode = NULL;
    slnode* pNode = pHead;
    while(pNode != NULL)
    {
        slnode *pNext = pNode->next;
        bool needDelete = false;
        if(pNext != NULL && pNext->data == pNode->data)
            needDelete = true;

        if(!needDelete)
        {
            pPreNode = pNode;
            pNode = pNode->next;
        }
        else
        {
            int value = pNode->data;
            slnode* pToBeDel = pNode;
            while(pToBeDel != NULL && pToBeDel->data == value)
            {
                pNext = pToBeDel->next;

                free(pToBeDel);
                pToBeDel = NULL;

                pToBeDel = pNext;
            }

            if(pPreNode == NULL)
                pHead = pNext;
            else
                pPreNode->next = pNext;
            pNode = pNext;
        }
    }
}

/*��ʾ���*/
void print(slnode *h)
{
    slnode *p=h->next;
    while(p!=NULL)
    {
        printf("%d   ",p->data);
        p=p->next;
    }
}


int main()
{
	slnode *h;
	while(1){
        h=initiate( );
        append(h);
        print(h);
        printf("\n");
        printf("ɾ����\n");
        DeletechongfuNode(h);
        print(h);
	}
}












