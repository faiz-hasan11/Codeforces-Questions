import java.util.*;
public class test
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b="";String c="aeiouy";
        for (int i=0;i<a.length();i++)
        {
            if(c.indexOf(Character.toLowerCase(a.charAt(i)))<0)
            System.out.print("."+Character.toLowerCase(a.charAt(i)));
        }
    }
}
