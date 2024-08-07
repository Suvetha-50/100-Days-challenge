import java.util.Scanner;
public class Day2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a % 10 == 0) {
            System.out.print(a + " is a multiple of 10");
        } else {
            System.out.println(a + " is not a multiple of 10");
        }

    }
}
