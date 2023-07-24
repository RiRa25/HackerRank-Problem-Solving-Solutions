import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rot = sc.nextInt();
        int temp=0;
        int[] arr = new int[num];
        for(int i=0; i<num; i++)
        {
            arr[i] = sc.nextInt();    
        }
        for(int i=0; i<rot; i++)
        {
            temp = arr[0];
            for(int j=0; j<num-1; j++)
            {
                arr[j] = arr[j+1];
            }
            arr[num-1] = temp;
        }    
        for(int i=0; i<num; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
