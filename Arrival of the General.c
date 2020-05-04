#include <stdio.h>
int main()
{
   int n;int k=0;int l=0;int m=0;int t=0;int s;int r=100;
   scanf("%d",&n);
   int a[n];
   for (int i=0;i<n;i++)
   {
   scanf("%d",&a[i]);
   if (a[i]>k)
   {
   k=a[i];
   l=i;
   }
   if(a[i]<=r)
   {
       r=a[i];
        t=i;
   }
   }
   if (l<t)
   s=l+(n-1)-(t);
   else
   s=l+(n-1)-t-1;
   printf("%d",s);
   return 0;
}

