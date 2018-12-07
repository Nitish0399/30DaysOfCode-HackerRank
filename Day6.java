import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
  Scanner sc = new Scanner(System.in);
        int y =sc.nextInt();
        sc.nextLine();
        for(int i=0;i<y;i++)
            {
        String str= sc.nextLine();
        char arr[] = str.toCharArray();
     
         for(int x=0;x<str.length();x=x+2)
            System.out.print(arr[x]);
        System.out.print(" ");
        
         for(int x=1;x<str.length();x=x+2)
             System.out.print(arr[x]);
        System.out.println();
        }  
    }
}
