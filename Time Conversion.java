import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String time, newtime = "";
        time = sc.next();
        if(time.charAt(8) == 'P')
        {
            if(time.substring(0,2).equals("12"))
            {
                String newStr = time.substring(0,8);
                System.out.println(newStr);
            }
            else
            {
                newtime = time.substring(0,2);
                int hr=Integer.parseInt(newtime);
                hr = hr + 12;
                String newStr = Integer.toString(hr) + time.substring(2,8);
                System.out.println(newStr);  
            }
        }
        if(time.charAt(8) == 'A')
        {
            if(time.substring(0,2).equals("12"))
            {
                String newStr = "00" + time.substring(2,8);
                System.out.println(newStr);
            }
            else
            {
                String newStr = time.substring(0,8);
                System.out.println(newStr);  
            }
        }
    }
}
