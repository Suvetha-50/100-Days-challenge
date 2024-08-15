import java.util.*;
import java.util.Scanner;
class Day10 {
    public static void main (String[]args) {
        Scanner sc=new Scanner(System.in);
        int reverse = 0, rem, temp;
        int num=sc.nextInt();

        temp = num;
        while (temp != 0)
        {
            rem = temp % 10;
            reverse = reverse * 10 + rem;
            temp /= 10;
        };
        if (num == reverse)
            System.out.println (num + " is Palindrome");
        else
            System.out.println (num + " is not Palindrome");
    }
}