import java.util.Scanner;

class Main {
    public static void main(String[] args)
{
  //Using scanner to allow input from user
  Scanner scan = new Scanner(System.in);
  
  //Using 'System.out.println'. to ask a question
  System.out.println("For how many seconds would you like to count down for?");
  int n = scan.nextInt();
  //Using 'countBackwwards' to start counting countBackwwardscountBackwards(n);
}
  //Using a recurssion loop so that the code will allow a backwards count
  public static void countBackwards(int n) {
    if(n == 0) {
      //Using another 'System.out.println' thatll alert you when time is super
      System.out.println("Alert! The countdown is over!");
    } else {
      System.out.println(n);
      n--;
      countBackwards(n);
    }
  }
}