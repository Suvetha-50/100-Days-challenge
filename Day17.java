import java.util.Scanner;

//automorphic number
class Day17{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int sq= a*a;
        while(a != 0){
            if(a % 10 != sq % 10){
                System.out.println("Not an automorphic number");
            }
            a /= 10;
            sq /= 10;
        }
        System.out.println("Automorphic number");
    }
}

