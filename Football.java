import java.util.*;
public class Tes
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        //Scanner sc1=new Scanner(System.in);
        String n1=sc.nextLine();
        int n=Integer.valueOf(n1);
        String a[]=new String[n-1];
        String b=sc.nextLine();
        int c=1;String f="";
        for (int i=0;i<n-1;i++)
        {
            String k=sc.nextLine();
            if (k.equals(b)==true)
            c++;
            else
            f=k;
        }
        int t=n-c;
        if (t>c)
        System.out.println(f);
        else
        System.out.println(b);
    }
}
