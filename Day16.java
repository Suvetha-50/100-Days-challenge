import java.util.Scanner;

//harshad number
class Day16{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int sum=0;
        while(n!= 0){
            sum+=n%10;
            n/=10;
        }
        if(n%sum==0){
            System.out.println("Harshad number");
        }
        else{
            System.out.println("Not a harshad number");
        }
    }
}