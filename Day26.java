import java.util.Scanner;

public class Day26{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int num = sc.nextInt();
        int temp, rem, result = 0;

        temp = num;

        while (temp != 0)
        {
            rem = num % 10;
            result += Math.pow(rem, 3);
            temp /= 10;
        }

        if(result == num)
            System.out.println(num + " is an Armstrong number.");
        else
            System.out.println(num + " is not an Armstrong number.");
    }
}