import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[26];
        int i;
        for(i=0; i<26; i++)
        {
            arr[i] = sc.nextInt();
        }
        String s = sc.next();
        int len = s.length();
        int[] arrnum = new int[len];
        for(i=0; i<len; i++)
        {
            int temp = s.charAt(i);
            temp = temp - 97;
            arrnum[i] = arr[temp];
        }
        int max = 0;
        for(i=0; i<len; i++)
        {
            if(arrnum[i] > max)
            {
                max = arrnum[i];
            }
        }
        System.out.println(max*len);
        
    
    }
}
