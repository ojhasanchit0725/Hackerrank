import java.io.*;
import java.util.*;


public class Solution 
{
    public static void main(String argc[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        long bigsum=0;
        n=sc.nextInt();
        for(int i=n;i>0;i--)
        {
            bigsum=bigsum+sc.nextInt();
        }
        System.out.println(bigsum);
    }
    
}
