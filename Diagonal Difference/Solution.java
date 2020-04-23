import java.io.*;
import java.util.*;
import java.math.*;
class Solution 
{
    static void diffrence(int arr[][],int n)
    {
            int m1=0,m2=0,f;
        for (int i = 0; i < n; i++) 
        { 
            for (int j = 0; j < n; j++) 
            {  
                if (i == j)
                { 
                    m1 += arr[i][j]; 
                }
                if (i == n-j-1) 
                {
                    m2 += arr[i][j];
                } 
            } 
        } 
        //System.out.println(m1);
        //System.out.println(m2);
            f=Math.abs(m1-m2);
            System.out.println(f);
    }
    public static void main(String argc[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                 arr[i][j]=sc.nextInt();
            }
        }
        diffrence(arr,n);
    }
    
       
}
