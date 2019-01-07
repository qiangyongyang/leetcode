

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



int main()
{
    int num;
    Stack *s1,*min;
    printf("输入栈的节点：");
    scanf("%d",&n);
    s1=init(n);
    min=init(n);

    for(int i=1;i<=n;i++){
        printf("输入进入栈s1的值：");
        scanf("%d",&num);
        push(s1,num);

        if(min->top == 0){                //若是栈空，则直接入栈
            push(min,num);
        }
        else{
            if(num>numTop(min)){                    //判断s1当前入站元素是否大于min中的栈顶元素（当前最小元素）
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













