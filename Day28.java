import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int i=0;
        String names[]=new String[N];
        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");

            String firstName = firstNameEmailID[0];

            String emailID = firstNameEmailID[1];
            String find="@gmail";
            Pattern p=Pattern.compile(find);
            Matcher m=p.matcher(emailID);
            if(m.find())
            {
                names[i]=firstName;
                i++;
            }
        }
        for(int j=0;j<names.length;j++)
        {
            
            for(int k=j+1;k<names.length;k++)
            {
                if(names[j]==null || names[k]==null)break;
                if(names[j].compareTo(names[k])>0)
                {
                    String buff=names[k];
                    names[k]=names[j];
                    names[j]=buff;

                }
                else
                continue;
            }
        }
          for(int m=0;m<names.length;m++ )
            {
                if(names[m]==null)
                break;
                else
                System.out.println(names[m]);
                
            }
        scanner.close();
    }
}
