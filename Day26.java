import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String y[]=sc.nextLine().split(" ");
        String x[]=sc.nextLine().split(" ");
        if(Integer.parseInt(y[2])==Integer.parseInt(x[2]))
        {
            if(Integer.parseInt(y[1])==Integer.parseInt(x[1]))
            {
                if(Integer.parseInt(y[0])<=Integer.parseInt(x[0]))
                {
                    System.out.println("0");
                }
                else
                {
                    int fine=Integer.parseInt(y[0])-Integer.parseInt(x[0]);
                    System.out.println(fine*15);
                }
            }
            else if(Integer.parseInt(y[1])<Integer.parseInt(x[1]))
            {
                System.out.println("0");
            }
            else
            {
                int fine=Integer.parseInt(y[1])-Integer.parseInt(x[1]);
                System.out.println(fine*500);
            }
        }
        else if(Integer.parseInt(y[2])<Integer.parseInt(x[2]))
        {
            System.out.println("0");
        }
        else
        {
           System.out.println("10000"); 
        }

    }
}

