import java.io.*;

import java.util.*;


public class Solution 
{
    public static void calculate(int arr1[],int arr2[])
            {
                int count=0;
                int count1=0;
                for(int i=0;i<3;i++)
                {
                    if(arr1[i]>arr2[i])
                    {
                        count++;
                    }
                    else if(arr1[i]<arr2[i])
                    {
                        count1++;
                    }
                }
                System.out.println(count+" "+count1);
            }
    public static void main(String args[])
    {
            Scanner sc = new Scanner(System.in);
            
            int arr1[] = new int[3];
            int arr2[] = new int[3];
            
            for(int i=0;i<3;i++)
            {
                arr1[i]=sc.nextInt();
            }
            for(int i=0;i<3;i++)
            {
                arr2[i]=sc.nextInt();
            }
            calculate(arr1,arr2);
    }
}
