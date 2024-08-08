//sum of N natural numbers
import java.io.*;
import java.util.Scanner;
class Day3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int a = sc.nextInt();
        for (int i = 0; i <= a; i++) {
            sum += i;
        }
        System.out.print(sum);

    }
}