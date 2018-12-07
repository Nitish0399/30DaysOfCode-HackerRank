import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        // Write Your Code Here
        int swap=0,end=n-1;
        while(end>0)
        {
               int pos=0;
               
        for(int i=0;i<end;i++)
        {
            if(a[i]>a[i+1])
            {
                int buf=a[i];
                a[i]=a[i+1];
                a[i+1]=buf;
                swap++;
               pos = i;
            }
            
        }
        end=pos;
            if(swap==0)
            break;
        }
        System.out.println("Array is sorted in "+swap+" swaps.");
        System.out.println("First Element: "+a[0]);
        System.out.println("Last Element: "+a[n-1]);
    }
}

