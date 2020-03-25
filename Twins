#include <stdio.h>
int main()
{
    int n;
    scanf("%d",&n);
    int a[n];int s=0;int k=0;
    for (int i=0;i<n;i++)
    {
    scanf("%d ",&a[i]);
    s+=a[i];
    }
    for (int i=0;i<n;i++)
    {
        for (int j=i+1;j<n;j++)
        {
            if (a[j]>a[i])
            {
                int k=a[j];
                a[j]=a[i];
                a[i]=k;
            }
        }
    }int r=0;
    for (int i=0;i<n;i++)
    {
        k+=a[i];
        if (k>(s-k))
        {
         r=i+1;
         break;
        }
    }
    printf("%d",r);
    
    return 0;
}
