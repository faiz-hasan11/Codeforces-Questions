import java.util.*;
public class test
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String n1=sc.nextLine();
        int n=Integer.valueOf(n1);
        String a=sc.nextLine();
        String[] t = a.split(" ");
        int k[]=new int[n];
        for (int i=0;i<n;i++){
            k[i]=Integer.valueOf(t[i]);  
        }
        int p=k[0];
        int q=k[0];
        int c=0;
        for (int i=0;i<n;i++){
                if (k[i]>p)
                {
                    p=k[i];
                    c++;
                }
                if (k[i]<q)
                {
                    q=k[i];
                    c++;
                }
        }
        System.out.println(c);
       
    }
}
