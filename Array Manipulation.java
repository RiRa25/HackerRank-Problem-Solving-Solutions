import java.util.*;

public class Solution {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int size  = sc.nextInt();
        int cases = sc.nextInt();

        long[] arr = new long[size];
        int value, start, end;
        
        
        for(int i = 0; i < cases; i++) {
            start = sc.nextInt();
            end   = sc.nextInt();
            value = sc.nextInt();
            
            arr[start-1] = arr[start-1] + value;
            if (end < size){
                arr[end] = arr[end] - value;
            }
        }

        long max  = arr[0];
        for(int i = 1; i < size; i++) {
            arr[i] = arr[i] + arr[i-1];
            if (arr[i] > max) {
                max = arr[i];    
            }
        } 
        System.out.println(max);   
    }
}