import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;

  
Difference(int []b)
    {
     elements=new int[b.length];
        for(int i=0;i<b.length;i++)
        {
            elements[i]=b[i];
        }
    }

    void computeDifference()
    {
        int ans;
       maximumDifference=Math.abs(elements[1]-elements[0]);
        for(int i=0;i<elements.length;i++)
        {
            for(int j=i+1;j<elements.length;j++)
            {
                ans=Math.abs(elements[j]-elements[i]);
                if(ans>=maximumDifference)
                {
                    maximumDifference=ans;
                }
            }
        }
    }
    

} 

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}