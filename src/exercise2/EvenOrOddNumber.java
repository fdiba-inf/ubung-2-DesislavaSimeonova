package exercise2;
import java.util.Scanner;
public class EvenOrOddNumber {
  public static void main (String[] args);
  Scanner input = new Scanner (System.in);
  int a = input.nextInt();
  if(num % 2 == 0) {
    System.out.println("num is even");
  } 
  else {
    System.out.println("num is odd");
  }
}
}