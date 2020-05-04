#include <stdio.h>
#include <math.h>
int main()
{
    int n;
    scanf("%d",&n);
    int a[n];
    for(int i=0;i<n;i++)
    scanf("%d",&a[i]);
    int k=1000;int r,s;
    for (int i=0;i<n;i++)
    {
        if (i<n-1)
        {
            int p=abs(a[i]-a[i+1]);
            if (p<k)
            {
            k=p;
            r=i+1;
            s=i+2;}
        }
        else
        {
            int p=abs(a[i]-a[0]);
            if(p<k){
            k=p;
            r=n;
            s=1;
        }
    }
    }
    printf("%d %d",r,s);
    return 0;
}
