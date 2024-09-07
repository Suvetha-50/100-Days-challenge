public class Day33{
  public static void main (String[]args){
    Scanner sc= new Scanner(System.in);
    int base = sc.nextInt();
    int x = sc.nextInt();
    System.out.println ("Required Power is " + power (base, x));
  }
  static int power (int base, int x){
    if (x == 0)
      return 1;
    return (base * power (base, x - 1));
  }
}
