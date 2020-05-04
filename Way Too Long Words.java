import java.util.*;
public class word
{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    //Scanner sc1=new Scanner(System.in);
    String n=sc.nextLine();
           

    for (int i=1;i<=Integer.valueOf(n);i++)
    {
        String a=sc.nextLine();
        if (a.length()>10){
        System.out.print((a.charAt(0)));
        System.out.print((a.length()-2));
        System.out.print((a.charAt(a.length()-1)));
        System.out.println();
    }else
        System.out.println(a);
    }
}
}
