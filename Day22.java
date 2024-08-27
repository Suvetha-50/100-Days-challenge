import java.util.Scanner;

//pattern
class Day22{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        for(int i=65;i<=70;i++){
            for(int j=65;j<=i;j++) {
                System.out.print((char) j+"");
            }
            System.out.println();

        }
    }
}