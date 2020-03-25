#include <stdio.h>
int main()
{
    int n;
    scanf("%d",&n);
    int a[n];int k=0;int c=0;
    for (int i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
        k+=a[i];
    }
    if (n==1)
        if (k%2==0)
        printf("2");
        else
        printf("3");
    else
    {
    int a=k%(n+1);
    for (int i=1;i<=5;i++)
    {
        if (((a+i-1)%(n+1)==0))
            c++;
    }
   c=5-c;
    printf("%d",c);
    }
    return 0;
}
