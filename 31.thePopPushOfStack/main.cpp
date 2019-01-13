#include <cstdio>
#include <cstdlib>
int n;
typedef struct{
    int data[0];
    int top;
}Stack;

Stack  *init(int n){
    if(n<=0)
    {
        printf("输入正确大小：");
        return NULL;
    }
    Stack *s=(Stack *)malloc(sizeof(Stack)+sizeof(int)*n);
    s->top=0;
    return s;
}

void push(Stack *s,int num){
    (s->top)++;
    s->data[s->top]=num;
}

int pop(Stack *s){
     return (s->data[(s->top)--]);
}

int numTop(Stack *s){
    return (s->data[s->top]);
}

void print(Stack *s){
    int i = s->top;
    while(i>0){
        printf("%d ",s->data[i]);
        i--;
    }
    printf("\n");
}

bool isEmpty(Stack *s){
    if(s->top==0)
        return true;
    return false;
}

int main()
{
    int num;
    Stack *s1,*s2;
    printf("输入栈的节点：");
    scanf("%d",&n);
    s1=init(n);
    s2=init(n);

    int pushOrder[6]={0,1,2,3,4,5};
    int popOrder[6]={0,2,3,5,4,1};

    int k=1;
    for(int i=1;i<=n;i++){
        push(s1,pushOrder[i]);
        if(popOrder[k]==numTop(s1)){
            pop(s1);
            k++;
        }
    }

    while(!isEmpty(s1)){
        if(numTop(s1)==popOrder[k]){
            pop(s1);
            k++;
        }
        else{
             printf("no\n");
             print(s1);
             break;
        }
    }
    if(isEmpty(s1)){
        printf("yes\n");
    }
    return 0;
}













