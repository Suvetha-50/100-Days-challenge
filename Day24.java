import java.util.Scanner;

public class Day24 {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt() ;
        int nextTerm;
        int a = 0, b = 1;
        System.out.print (a + " , " + b + " , ");
        for (int i = 2; i < num; i++)
        {
            nextTerm = a + b;
            a = b;
            b = nextTerm;
            System.out.print (nextTerm + " , ");
        }
    }
}