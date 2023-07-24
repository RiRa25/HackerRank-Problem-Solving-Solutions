import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int num1 = sc.nextInt();
        String[] comp = new String[num1];
        for(int i=0; i<num1; i++)
        {
            comp[i] = sc.next();
        }
        
        int num2 = sc.nextInt();
        String[] input = new String[num2];
        for(int i=0; i<num2; i++)
        {
            input[i] = sc.next();
        }
        
        int count = 0;
        
        for(int i=0; i<num2; i++)
        {
            for(int j=0; j<num1; j++)
            {
                if(input[i].equals(comp[j]))
                {
                    count = count + 1;
                }
            }
            System.out.println(count);
            count = 0;
        }
    }
}
