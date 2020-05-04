import java.util.*;
public class test
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=n-10;
        if (k>=2 && k<=9)
        System.out.println("4");
        else if (k==10)
        System.out.println("15");
        else if (k==11)
        System.out.println("4");
        else if (k==1)
        System.out.println("4");
        else
        System.out.println("0");
        
    }
}
