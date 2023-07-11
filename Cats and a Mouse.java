import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution
{
    public static void main(String[] args)
    {    
        Scanner sc = new Scanner(System.in);
        int num;
        int catA, catB, mouseC;
        int dist1, dist2;
        num = sc.nextInt();
        int[][] cases = new int[num][3];
        for(int i=0; i<num; i++)
        {
            for(int j=0; j<3; j++)
            {
                cases[i][j] = sc.nextInt();
            }
        }
        
        for(int i=0; i<num; i++)
        {
            catA = cases[i][0];
            catB = cases[i][1];
            mouseC = cases[i][2];
            
            dist1 = Math.abs(catA - mouseC);
            dist2 = Math.abs(catB - mouseC);
            
            if(dist1 == dist2)
            {
                System.out.println("Mouse C");
            }
            if(dist1 > dist2)
            {
                System.out.println("Cat B");
            }
            if(dist2 > dist1)
            {
                System.out.println("Cat A");
            }
            
        }
    }
}
