#include<stdio.h>
int main()
{
    int s,n;
    scanf("%d %d",&s,&n);
    int x[n];
    int y[n];
    int t=0;
    for (int i=0;i<n;i++)
        scanf("%d %d",&x[i],&y[i]);
        for (int i=0;i<n;i++)
        {
            for (int j=i+1;j<n;j++)
            {
                if (x[j]<x[i])
                {
                    int q=x[i];
                    x[i]=x[j];
                    x[j]=q;
                    int r=y[i];
                    y[i]=y[j];
                    y[j]=r;
                }
            }
        }
       
    for (int i=0;i<n;i++)
    {
        if(s>x[i])
            s+=y[i];
        else
        {
            t=1;
            break;
        }
    }
    if(t==1)
        printf("NO");
    else
        printf("YES");
    return 0;
}
