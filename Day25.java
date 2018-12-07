import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
    
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        for(int i=0;i<n;i++)
        {
            boolean con=true;
            int x=sc.nextInt();
            for(int j=2;j<=Math.sqrt(x);j++)
            {
                if(x%j==0)
                {
                    con=false;
                    break;
                }
            }
            if(con && x!=1)
            System.out.println("Prime");
            else
            System.out.println("Not prime");
            
        }
       
}
}

