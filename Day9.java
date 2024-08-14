//Star pattern
import java.util.*;
import java.util.Scanner;
class Day9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++)
                if ((i == 1 || i == col) || (j == 1 || j == col))
                    System.out.print("*");
                else
                    System.out.print(" ");

            System.out.println();
        }

    }
}
