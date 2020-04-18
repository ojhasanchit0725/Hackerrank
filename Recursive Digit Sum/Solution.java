import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        String n = s.next();
        int k = s.nextInt();
        int n1=0;
        char[] st = n.toCharArray();
        //System.out.println(st);
        for(int i=0;i<st.length;i++){
           int j=st[i];
           //System.out.println(j);
            n1=n1+Character.getNumericValue(j);
           // System.out.print(n1);
            n1=n1%9;
            
        }
       // System.out.println(n1);
        int f = 9;
        if(((n1%f)*(k%f))%f==0)
            System.out.println(f);
        else
            System.out.println(((n1%f)*(k%f))%f);
        
        
    }
   
}