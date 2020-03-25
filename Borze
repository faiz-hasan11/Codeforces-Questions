import java.util.*;
public class test
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();String b="";
        for (int i=0;i<a.length();i++)
        {
            if (a.charAt(i)=='.')
            b+="0";
            if (a.charAt(i)=='-' && a.charAt(i+1)=='.'){
            b+="1";
            i++;
            }
            if (a.charAt(i)=='-' && a.charAt(i+1)=='-'){
            b+="2";
            i++;
            }
        }
        System.out.println(b);
    }
}
