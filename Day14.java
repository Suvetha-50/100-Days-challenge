import java.util.Scanner;

//friendly number
class Day14{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int sum1=0,sum2=0;
        for(int i=1;i<=a;i++){
            if(a%i==0){
                 sum1+=i;
            }
        }
        for(int i=1;i<=b;i++){
            if(b%i==0){
                sum2+=i;
            }
        }
        if(a/sum1==b/sum2){
            System.out.println("Friendly number");
        }
        else{
            System.out.println("Not a friendly number");
        }
    }
}