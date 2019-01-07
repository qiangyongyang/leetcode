#include <cstdio>
#include <cstdlib>
#include <algorithm>
#include <vector>
using namespace std;

int num[100];  // 2 3 4 2 6 2 5 1
int k;   //8
int main()
{
    int n;
    printf("输入滑窗大小：");
    scanf("%d",&k);
    printf("输入数组长度：");
    scanf("%d",&n);
    for(int i=0;i<n;i++){
        scanf("%d",&num[i]);
    }
    vector<int> v1;

    for(int i=0;i<(n-k+1);i++){
        int temp=0;
        for(int j=i;j<(i+k);j++){
            if(num[j]>temp){
                temp=num[j];
            }
        }
        v1.push_back(temp);
    }


    for(int i=0;i<v1.size();i++){
        printf("%d ",v1[i]);
    }
    return 0;
}
























































































