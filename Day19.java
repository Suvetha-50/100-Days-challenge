import java.util.Scanner;

//strong number
class Day19{
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i;
        int sum = 0, temp, digit, fact;

        temp = n;
        while (temp != 0) {
            i = 1;
            fact = 1;
            digit = temp % 10;

        while (i <= digit) {
            fact *= i;
            i++;
        }
        sum += fact;
        temp /= 10;
    }
        if(n==sum){
            System.out.println("Strong number");
        }
        else{
            System.out.println("Not a Strong number");
        }
    }
}