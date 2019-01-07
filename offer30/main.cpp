

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



int main()
{
    int num;
    Stack *s1,*min;
    printf("����ջ�Ľڵ㣺");
    scanf("%d",&n);
    s1=init(n);
    min=init(n);

    for(int i=1;i<=n;i++){
        printf("�������ջs1��ֵ��");
        scanf("%d",&num);
        push(s1,num);

        if(min->top == 0){                //����ջ�գ���ֱ����ջ
            push(min,num);
        }
        else{
            if(num>numTop(min)){                    //�ж�s1��ǰ��վԪ���Ƿ����min�е�ջ��Ԫ�أ���ǰ��СԪ�أ�
                push(min,numTop(min));
            }
            else{
                push(min,num);
            }
        }
    }

    print(s1);
    print(min);
    return 0;
}













