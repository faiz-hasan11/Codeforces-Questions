import java.util.*;
public class word
{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    int d[]=new int[8];
    d[0]=a+b+c;
    d[1]=a*b*c;
    d[2]=a+b*c;
    d[3]=a*b+c;
    d[4]=(a*b)+c;
    d[5]=(a+b)*c;
    d[6]=a+(b*c);
    d[7]=a*(b+c);
    int k=0;
    for (int i=0;i<8;i++)
    k=Math.max(k,d[i]);
    System.out.println(k);
}
}
