#include <stdio.h>
int main()
{
    int t;
    scanf("%d",&t);
    for(int i=1;i<=t;i++)
    {
        int n;
        scanf("%d",&n);
        if((360)%(180-n)==0)
        printf("YES\n");
        else
        printf("NO\n");
    }
    return 0;
}
