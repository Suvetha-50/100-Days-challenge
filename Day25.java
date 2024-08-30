import java.util.ArrayList;
import java.util.Scanner;

class Day25{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        ArrayList primeFactors = new ArrayList();
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0)
                        count += 1;
                }
                if (count == 0)
                    primeFactors.add(i);
            }
        }
        System.out.println("The prime factors of number " + num +" is " + primeFactors);
    }
}