import java.util.*;
import java.lang.*;
import java.util.Arrays;

public class Max {
    public static int findMax(int[] arr){
        int max;
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int res=findMax(arr);
        System.out.print(res);
    }
}
