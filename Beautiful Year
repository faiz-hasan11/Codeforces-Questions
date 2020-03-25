import java.util.*;
public class unique
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=0;
        while (k!=1)
        {
            k=check(++n);        
    }
    System.out.println(n);
}
static int check(int x)
{
    int a[]=new int[10];
    while(x!=0)
    {
        a[x%10]++;
        x=x/10;
    }
    for (int i=0;i<10;i++)
    if (a[i]>1)
    return 0;
    return 1;
}
}
        
