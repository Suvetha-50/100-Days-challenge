import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long nLong = (long)n;
        System.out.print(nLong * (nLong + 1) / 2);
    }
}
