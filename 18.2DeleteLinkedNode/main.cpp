

#include <stdio.h>
#include <stdlib.h>
typedef int datatype;

typedef struct node
{
	datatype data;
	struct node *next;
}slnode;
/*初始化*/
slnode *initiate(){
    slnode *h;
    h=(slnode *)malloc(sizeof(slnode));
    h->next=NULL;
    return h;
}



/*建立单链表*/
int append (slnode *h)
{
	slnode *p,*q;
	int n;         /* n 单链表中最初的结点数*/
	int a[10];       /* a 单链表中最初的数据*/
	if(h==NULL)
	{
		printf("单链表未初始化！\n");
		return 0;
	}
	printf("请输入单链表最初的结点数n=");
	scanf("%d",&n);
	printf("请输入各个结点数据域的值:");
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

/*删除重复节点*/
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

/*显示输出*/
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
        printf("删除后：\n");
        DeletechongfuNode(h);
        print(h);
	}
}












