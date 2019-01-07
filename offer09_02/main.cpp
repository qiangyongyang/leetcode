#include <stdio.h>
#include <stdlib.h>
#define MAXSIZE 60 //存储数据元素的最大个数

typedef struct {
    int data[MAXSIZE];
    int front; //记录队列头元素位置
    int rear; //记录队列尾元素位置
}Queue;

Queue* CreateQueue() {
    Queue* q = (Queue*)malloc(sizeof(Queue));
    q->front = 0;
    q->rear = 0;
    return q;
}


void AddQ(Queue* q, int num) {
    if ( q->rear  == MAXSIZE ) {
        printf("队列已满\n");
        return;
    }
    q->rear++;
    q->data[q->rear] = num;
}



int DeleteQ(Queue* q) {
    if (q->rear == q->front) {
        printf("空队列\n");
        return NULL;
    }
    q->front++;
    return q->data[q->front];
}

void PrintQueue(Queue* q) {
    if (q->rear == q->front) {
        printf("空队列\n");
        return;
    }
    printf("打印队列数据元素：\n");
    int index = q->front;
    for (int i = 0; i < (q->rear - q->front); i++) {
        index++;
        printf("%d ", q->data[index]);
    }
    printf("\n");
}

int main() {
    int n;
    Queue* q1 = CreateQueue();
    Queue *q2 = CreateQueue();

    printf("队中的节点：");
    scanf("%d",&n);
    for(int i=1;i<=n;i++){
         AddQ(q1, i);
    }
    PrintQueue(q1);

    while(n){
       for(int i=1;i<n;i++){
            AddQ(q2,DeleteQ(q1));    //把1队的前n-1数个出队，放到2队
       }

       int x=DeleteQ(q1);            //1队剩下的那个出队
       printf("%d  ",x);

       for(int i=1;i<n;i++){
           AddQ(q1,DeleteQ(q2));     //把2队的n-1个数出队，放回1队
       }

       n--;                           //循环n次
    }



    return 0;
}

/*#include<iostream>
#include <queue>
using namespace std;

template<class T>
class Mystack
{
public:
	void Push(T value);
	T Top();
	T Pop();
private:
	queue<T> Queue1;
	queue<T> Queue2;
};

//入栈
template<class T>
void Mystack<T>::Push(T a)
{
	Queue1.push(a);
}

//栈顶
template<class T>
T Mystack<T>::Top()
{
	return Queue1.back();//???????????这里是否可以
}

//出栈
template<class T>
T Mystack<T>::Pop()
{
	int node = 0;
	while(Queue1.back() != Queue1.front())
	{
		int num = Queue1.front();
		Queue2.push(num);
		Queue1.pop();
	}
	node = Queue1.back();
	Queue1.pop();

	while(!Queue2.empty())
	{
		int num = Queue2.front();
		Queue1.push(num);
		Queue2.pop();
	}
	return node;
}
void Test()
{
	Mystack<int> s1;
	s1.Push(1);
	s1.Push(2);
	s1.Push(3);
	s1.Push(4);
	s1.Push(5);
    cout<<s1.Top()<<endl;
	for(int i = 0; i < 5; i++)
	{
		cout<<s1.Pop()<<"->";
	}
	cout<<"NULL"<<endl;
}

int main()
{
	Test();
	return 0;
}*/
