import java.util.*;
import java.util.Scanner;
class Day11 {

    static boolean isPerfectSquare(int x)
    {
        if (x >= 0) {

            int a = (int)Math.sqrt(x);

            return ((a * a) == x);
        }
        return false;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x = sc.nextInt();

        if (isPerfectSquare(x))
            System.out.print("True");
        else
            System.out.print("False");
    }
}