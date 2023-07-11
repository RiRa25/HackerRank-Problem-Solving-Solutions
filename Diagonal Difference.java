import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[][] arr = new int[num][num];
        for(int i=0; i<num; i++)
        {
            for(int j=0; j<num; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        int sum1=0, sum2=0;
        for(int i=0; i<num; i++)
        {
            sum1 = sum1 + arr[i][i]; 
        }
        for(int i=0; i<num; i++)
        {
            sum2 = sum2 + arr[i][num-1-i]; 
        }
        if(sum1 > sum2)
        {
            System.out.println(sum1-sum2);
        }
        if(sum2 > sum1)
        {
            System.out.println(sum2-sum1);
        }
        if(sum1 == sum2)
        {
            System.out.println("0");
        }
       
    }
}
