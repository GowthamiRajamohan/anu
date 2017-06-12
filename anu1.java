import java.io.*;
import java.util.*;
class num
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        int sum=0;
         for(int i=0;i<=t;i++)
        {
           sum=sum+i;    
        }
        System.out.println(sum);
    }
}
