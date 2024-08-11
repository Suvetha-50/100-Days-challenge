//reverse the number
import java.util.*;
import java.util.Scanner;
class Day6{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int rev=0;
        int rem=0;
        while(n!=0){
            rem=n%10;
            rev=rev*10+rem;
            n/=10;
        }
        System.out.println(rev);
    }
}
