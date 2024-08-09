//prime or not
import java.io.*;
import java.util.Scanner;
class Day4{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        boolean prime= true;
        if(a<2){
            prime= false;
        }
        else {
            for (int i = 2; i <= a / 2; i++) {
                if (a % i == 0) {
                    prime = false;
                    break;
                }
            }
        }
        String result = prime ? "Prime" : "not Prime";
        System.out.println ("The number " + a + " is : " + result);

    }
}