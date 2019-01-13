/*-------------------------------------------------------方法一*///////////////////////////////////////////
void PrintListReversingly (slnode *h)
    slnode *p,*q;
    p=h->next;
    h->next=null;
    while(p!=null){
        q=p;
        p=p->next;
        q->next=h->next;
        h->next=q;
    }

}

void display(slnode *h)
{
    slnode *p;
    p=h->next;
    while(p!=null){
        printf("%d",p->data);
        p=p->next;

    }
}



/*-------------------------------------------------------方法二*///////////////////////////////////////////
void PrintListReversingly (slnode *h){
    slnode *p,*q;
    stack <slnode > sta;
    p=h->next;
    while(p!=null){
        sta.push(p->data);
        p=p->next;
    }
    while(!sta.empty()){
        int num=sta.pop();
        printf("%d ",num);
    }
}










