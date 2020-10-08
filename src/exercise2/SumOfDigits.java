package exercise2;

import java.util.Scanner;
public class SumofDigits{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println
    int number = input.nextInt();
    int firstdig = number%10;
    int secondig = (number%100)/10;
    int thirddig=number/100;
    int SumOfDig=firstdig+seconddig+thirddig;
    System.out.println("Sum of digits: " +SumOfDig);
  }
}