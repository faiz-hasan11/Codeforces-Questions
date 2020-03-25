#include <stdio.h>
int main()
{
    int n;
    scanf("%d",&n);
    int k=n;
    int t=0;
    for(int i=0;i<=n;i++)
    {
        for (int j=1;j<=k;j++)
            printf("  ");
        for (int p=0;p<=t;p++)
            if(i==0)
            printf("%d",p);
        else
            printf("%d ",p);
        for(int y=t-1;y>=0;y--)
            if(y==0)
            printf("%d",y);
        else
            printf("%d ",y);
            printf("\n");
        t++;
        k--;
    }
    int k1=1;
    int t1=n-1;
    for (int i=0;i<=n-1;i++)
    {
        for (int j=1;j<=k1;j++)
            printf("  ");
        for (int p=0;p<=t1;p++)
            if(i==n-1)
            printf("%d",p);
        else
            printf("%d ",p);
        for (int y=t1-1;y>=0;y--)
            if(y==0)
            printf("%d",y);
        else
            printf("%d ",y);
            printf("\n");
        k1++;
        t1--;
    }
    return 0;
}
