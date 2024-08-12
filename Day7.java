//factorial of a number
import java.util.*;
import java.util.Scanner;
class Day7{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int fact=1;
        int i;
        for(i=1;i<=n;i++){
            fact = fact * i;
        }
            System.out.println(fact);


    }
}