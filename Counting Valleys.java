import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, count=0, valley=0, steep=0;
        String s;
        num = sc.nextInt();
        s = sc.next();
        for(int i=0; i<num; i++)
        {
            if(s.charAt(i) == 'U')
            {
                count = count + 1;
            }
            if(s.charAt(i) == 'D')
            {
                count = count - 1;
            }
            if(count < 0)
            {
                steep = 1;
            }
            if(count == 0 && steep == 1)
            {
                valley++;
                steep = 0;
            }
        }
        System.out.println(valley);
        
    }
}
