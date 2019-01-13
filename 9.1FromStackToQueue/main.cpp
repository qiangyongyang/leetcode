// ������9��������ջʵ�ֶ���
// ��Ŀ��������ջʵ��һ�����С����е��������£���ʵ��������������appendTail
// ��deleteHead���ֱ�����ڶ���β����������ڶ���ͷ��ɾ�����Ĺ��ܡ�


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
        printf("������ȷ��С��");
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

void print(Stack *s){
    int i = s->top;
    while(i>0){
        printf("%d ",s->data[i]);
        i--;
    }
    printf("\n");
}



int main()
{
    Stack *s1,*s2;
    printf("����ջ�Ľڵ㣺");
    scanf("%d",&n);
    s1=init(n);
    s2=init(n);
    for(int i=1;i<=n;i++)
    {
        push(s1,i);
    }
    print(s1);

    for(int i=1;i<n;i++){
        push(s2,pop(s1));
    }

    int x=pop(s1);
    printf("%d ",x);

    for(int i=1;i<n;i++){
        printf("%d ",pop(s2));
    }
    return 0;
}













