import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class Solution {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        long[] arr1 = new long[5];
        long[] newarr = new long[5];
        long sum=0, max=0, min;
        for(int i=0; i<5; i++)
        {
            arr1[i] = sc.nextInt();
        }
        for(int i=0; i<5; i++)
        {
            sum = sum + arr1[i];
        }
        for(int i=0; i<5; i++)
        {
            newarr[i] = sum - arr1[i];
        }
        min = newarr[0];
        for(int i=0; i<5; i++)
        {
            if(newarr[i] >= max)
            {
                max = newarr[i];
            }
            if(newarr[i] <= min)
            {
                min = newarr[i];
            }
        }
        System.out.println(min + " " + max);
    
        
    }
}
