//abundant number
import java.util.Scanner;

class Day15{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            if(n%i==0) {
                sum += i;
            }
        }
        if(sum>n){
            System.out.println("It is an abundant number with abundance value "+(sum-n));
        }
        else{
            System.out.println("Not a abundant number");
        }
    }
}
