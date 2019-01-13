#include <stdio.h>
#include <stdlib.h>
#define MAXSIZE 60 //�洢����Ԫ�ص�������

typedef struct {
    int data[MAXSIZE];
    int front; //��¼����ͷԪ��λ��
    int rear; //��¼����βԪ��λ��
}Queue;

Queue* CreateQueue() {
    Queue* q = (Queue*)malloc(sizeof(Queue));
    q->front = 0;
    q->rear = 0;
    return q;
}


void AddQ(Queue* q, int num) {
    if ( q->rear  == MAXSIZE ) {
        printf("��������\n");
        return;
    }
    q->rear++;
    q->data[q->rear] = num;
}



int DeleteQ(Queue* q) {
    if (q->rear == q->front) {
        printf("�ն���\n");
        return NULL;
    }
    q->front++;
    return q->data[q->front];
}

void PrintQueue(Queue* q) {
    if (q->rear == q->front) {
        printf("�ն���\n");
        return;
    }
    printf("��ӡ��������Ԫ�أ�\n");
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

    printf("���еĽڵ㣺");
    scanf("%d",&n);
    for(int i=1;i<=n;i++){
         AddQ(q1, i);
    }
    PrintQueue(q1);

    while(n){
       for(int i=1;i<n;i++){
            AddQ(q2,DeleteQ(q1));    //��1�ӵ�ǰn-1�������ӣ��ŵ�2��
       }

       int x=DeleteQ(q1);            //1��ʣ�µ��Ǹ�����
       printf("%d  ",x);

       for(int i=1;i<n;i++){
           AddQ(q1,DeleteQ(q2));     //��2�ӵ�n-1�������ӣ��Ż�1��
       }

       n--;                           //ѭ��n��
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

//��ջ
template<class T>
void Mystack<T>::Push(T a)
{
	Queue1.push(a);
}

//ջ��
template<class T>
T Mystack<T>::Top()
{
	return Queue1.back();//???????????�����Ƿ����
}

//��ջ
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
