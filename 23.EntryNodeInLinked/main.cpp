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
    q->next=h->next->next->next;
    return 1;
}


void print(slnode *h){
    slnode *p=h->next;
    while(p!=NULL){
        printf("%d  ",p->data);
        p=p->next;
    }
}

slnode *MeetingNode(slnode *h){      //ȷ���Ƿ���ڻ�
    if(h==NULL)
        return NULL;

    slnode *pslow=h->next;
    if(pslow==NULL)
        return NULL;

    slnode *pfast=pslow->next;
    while(pfast!=NULL &&pslow !=NULL){
        if(pfast==pslow)
            return pslow;

        pslow=pslow->next;
        pfast=pfast->next;

        printf("666\n");
        if(pfast->next!=NULL){
            pfast=pfast->next;
        }

    }
    return NULL;

}






slnode *entryNodeOfLoop(slnode *h){

    slnode *meetingNode=MeetingNode(h);
    if(meetingNode==NULL)
        return NULL;

    int numLoop=1;
    slnode *p=meetingNode;
    while(p->next!=meetingNode){
        numLoop++;
        p=p->next;
    }
    printf("�ڵ��л��Ľڵ���ĿΪ%d:\n",numLoop);



    slnode *m1=h->next;
    slnode *m2=h->next;
    for(int i=1;i<=numLoop;i++){
        m1=m1->next;
    }
    while(m1!=m2){
        m1=m1->next;
        m2=m2->next;
    }
    return m1;
}













int main()
{
    slnode *h;
    h=init();
    append(h);
    slnode *ans= entryNodeOfLoop(h);
    printf("��ڽڵ��ֵλ��%d\n",ans->data);
    return 0;
}












