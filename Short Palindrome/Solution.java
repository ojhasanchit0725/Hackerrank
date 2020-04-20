import java.io.*;
import java.util.*;

public class Solution 
{ 
    static int tuple=1000000007;
    public static void main(String[] args) 
    {
        Scanner scan=new Scanner(System.in);
        String st=scan.nextLine();
        int[] arr1=new int[26];
        int[][] arr2=new int[26][26];
        int[] arr3=new int[26];
        int answer=0,i=0;

        while(i<st.length())
        {
            int c = (int)(st.charAt(i)-'a');
            answer=answer+(arr3[c]%tuple);
            answer=answer%tuple;
            int j=0;
            while(j<26)
            {
                arr3[j]=arr3[j]+(arr2[j][c]%tuple);
                arr3[j]=arr3[j]%tuple;
                j++;
            }
            int k=0;
            while(k<26)
            {
                arr2[k][c]=arr2[k][c]+(arr1[k]%tuple);
                 arr2[k][c]=arr2[k][c]%tuple;
                 k++;
            }
            
            arr1[c]++;
            arr1[c] = arr1[c]%tuple;
            i++;
        }
        System.out.println(answer);
    }

}